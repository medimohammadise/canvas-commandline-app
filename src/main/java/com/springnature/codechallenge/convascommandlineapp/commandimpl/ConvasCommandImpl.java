package com.springnature.codechallenge.convascommandlineapp.commandimpl;

import com.springnature.codechallenge.convascommandlineapp.command.Command;

public class ConvasCommandImpl implements Command {
    private String commandName;

    public ConvasCommandImpl(String commandName){
        this.commandName=commandName;
    }

    @Override
    public String getName() {
        return commandName;
    }
}
