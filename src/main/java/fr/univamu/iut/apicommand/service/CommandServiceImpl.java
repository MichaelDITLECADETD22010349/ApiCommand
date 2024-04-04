package fr.univamu.iut.apicommand.service;

import fr.univamu.iut.apicommand.entity.Command;
import fr.univamu.iut.apicommand.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommandServiceImpl implements CommandService{

    private final CommandRepository commandRepository;

    @Autowired
    public CommandServiceImpl(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }

    @Override
    public ArrayList<Command> getAllCommand() {
        return (ArrayList<Command>) this.commandRepository.findAll();
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