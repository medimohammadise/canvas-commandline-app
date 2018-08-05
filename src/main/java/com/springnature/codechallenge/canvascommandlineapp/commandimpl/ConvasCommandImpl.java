package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.command.Command;
/**
 * This class is the parent concrete class for all other command classes
 */
public class ConvasCommandImpl implements Command {
    private String commandName;

    public ConvasCommandImpl(String commandName){
        this.commandName=commandName;
    }

    @Override
    public String getName() {
        return commandName;
    }

    @Override
    public void draw() {

    }
}
