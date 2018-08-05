package com.springnature.codechallenge.canvascommandlineapp.command;

import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.QuiteCanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;

import java.util.Arrays;

/**
 * CanvasCommandFactory process commandLine argument and create related concrete class (CanvasCommandImpl) based on the the commandName and the arguments
 *
 */
public class CanvasCommandFactory {

    public static Command create(String commandLine) throws CanvasCommandLineAppException {
        String[] commandLineElements = commandLine.split(Constants.SEPARATOR);
        String command = commandLineElements[0];
        String[] commandArguments = null;
        if (!Constants.COMMAND_QUIT.equals(command)) {
            commandArguments = Arrays.copyOfRange(commandLineElements, 1, commandLineElements.length);
        }
        switch (command) {
            case Constants.COMMAND_CREATE_NEW_CONVAS:
                return  new CreateCanvasImpl(commandArguments);
            case Constants.COMMAND_DRAW_NEW_LINE:
                //TODO Draw new line
            case Constants.COMMAND_DRAW_NEW_RECTANGLE:
                //TODO Draw new Rectangle
            case Constants.COMMAND_BUCKET_FILL:
                //TODO backet fill
            case Constants.COMMAND_QUIT:
                return new QuiteCanvasImpl();
        }
        throw new CanvasCommandLineAppException(ErrorCodes.UNSUPPORTED_OR_WRONG_COMMAND_LINE);
    }
}
