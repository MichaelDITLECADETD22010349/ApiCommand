package fr.univamu.iut.apicommand.controller;

import fr.univamu.iut.apicommand.entity.Command;
import fr.univamu.iut.apicommand.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/command")
public class CommandController {

    private final CommandService commandService;

    @Autowired
    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    @GetMapping("/all")
    public String getAllCommands() {
        return this.commandService.getAllCommand().toString();
    }

    @GetMapping("{id}")
    public String getCommandById(@PathVariable int id) {
        return this.commandService.getCommandById(id).toString();
    }

    @PostMapping("/add")
    public String addCommand(@RequestBody Command command) {
        return this.commandService.addCommand(command).toString();
    }

    @PutMapping("/update")
    public String updateCommand(@RequestBody Command command) {
        return this.commandService.updateCommand(command).toString();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommand(@PathVariable int id) {
        this.commandService.deleteCommand(id);
    }
}