package com.springnature.codechallenge.canvascommandlineapp.command;

import com.springnature.codechallenge.canvascommandlineapp.commandimpl.*;
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
            case Constants.COMMAND_CREATE_NEW_CANVAS:
                return  new CreateCanvasCommandImpl(commandArguments);
            case Constants.COMMAND_DRAW_NEW_LINE:
                return new DrawLineCommandImpl(commandArguments);
            case Constants.COMMAND_DRAW_NEW_RECTANGLE:
                return new DrawRectangleCommandImpl(commandArguments);
            case Constants.COMMAND_BUCKET_FILL:
                return new BucketFillCommandImpl(commandArguments);
            case Constants.COMMAND_QUIT:
                return new QuiteCanvasCommandImpl();
        }
        throw new CanvasCommandLineAppException(ErrorCodes.UNSUPPORTED_OR_WRONG_COMMAND_LINE);
    }
}
