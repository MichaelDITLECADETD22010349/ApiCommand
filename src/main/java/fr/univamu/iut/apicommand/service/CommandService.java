package fr.univamu.iut.apicommand.service;

import fr.univamu.iut.apicommand.entity.Command;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CommandService {
    public ArrayList<Command> getAllCommand();
    public Command getCommandById(int id);
    public Command addCommand(Command command);
    public Command updateCommand(Command command);
    public void deleteCommand(int id);
}