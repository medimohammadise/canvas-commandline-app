package com.springnature.codechallenge.convascommandlineapp.commandimpl;

import com.springnature.codechallenge.convascommandlineapp.command.Command;

public class ConvasCommandImpl implements Command {
    private String commandName;
    @Override
    public String getName() {
        return commandName;
    }
}
