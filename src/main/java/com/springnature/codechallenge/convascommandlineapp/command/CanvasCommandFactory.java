package com.springnature.codechallenge.convascommandlineapp.command;

import com.springnature.codechallenge.convascommandlineapp.commandimpl.ConvasCommandImpl;
import com.springnature.codechallenge.convascommandlineapp.constant.Constants;

import java.util.Arrays;

/**
 * CanvasCommandFactory process commandLine argument and create ConvasCommandImpl based on the arguments
 *
 */
public class CanvasCommandFactory {

    public static Command create(String commandLine) {
        String[] commandLineElements = commandLine.split(Constants.SEPARATOR);
        String command = commandLineElements[0];
        String[] commandArguments = null;
        if (!Constants.COMMAND_QUIT.equals(command)) {
            commandArguments = Arrays.copyOfRange(commandLineElements, 1, commandLineElements.length);
        }
        //TODO validate commandArguments
        switch (command) {
            case Constants.COMMAND_CREATE_NEW_CONVAS:
                //TODO Create new Convas Command
            case Constants.COMMAND_DRAW_NEW_LINE:
                //TODO Draw new line
            case Constants.COMMAND_DRAW_NEW_RECTANGLE:
                //TODO Draw new Rectangle
            case Constants.COMMAND_BUCKET_FILL:
                //TODO backet fill
            case Constants.COMMAND_QUIT:
                //Quit
        }
        return new ConvasCommandImpl();
    }
}
