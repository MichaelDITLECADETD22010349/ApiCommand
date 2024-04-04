package fr.univamu.iut.apicommand.service;

import fr.univamu.iut.apicommand.entity.Command;
import fr.univamu.iut.apicommand.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.util.ArrayList;

@Service
public class CommandServiceImpl implements CommandService{

    private final CommandRepository commandRepository;
    private final WebClient webClient;

    @Autowired
    public CommandServiceImpl(CommandRepository commandRepository, WebClient webClient) {
        this.commandRepository = commandRepository;
        this.webClient = webClient;
    }

    @Override
    public ArrayList<Command> getAllCommand() {
        ArrayList<Command> commands = new ArrayList<>();
        this.commandRepository.findAll().forEach(command -> {
            command.getMenuIds().forEach(menuId -> {
                Mono<Menu> menuMono = webClient.get()
                        .uri("/menu/{id}", menuId)
                        .retrieve()
                        .bodyToMono(Menu.class)
                        .onErrorReturn(new Menu());

                Menu menu = menuMono.block();
            });
            commands.add(command);
        });
        return commands;
    }

    @Override
    public Command getCommandById(int id) {
        return this.commandRepository.findById(id).orElse(null);
    }

    @Override
    public Command addCommand(Command command) {
        return this.commandRepository.save(command);
    }

    @Override
    public Command updateCommand(Command command) {
        return this.commandRepository.save(command);
    }

    @Override
    public void deleteCommand(int id) {
        this.commandRepository.deleteById(id);
    }
}