package com.springnature.codechallenge.canvascommandlineapp.test;

import com.springnature.codechallenge.canvascommandlineapp.command.CanvasCommandFactory;
import com.springnature.codechallenge.canvascommandlineapp.command.Command;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandFactoryTest {

    @Test
    public void createShouldCreateLineCommand() throws CanvasCommandLineAppException {
        String commandLine = "L 1 2 6 2";
        Command command = CanvasCommandFactory.create(commandLine);
        assertEquals(Constants.COMMAND_DRAW_NEW_LINE, command.getName());
    }

    @Test(expected =CanvasCommandLineAppException.class)
    public void createShouldRaiseException() throws CanvasCommandLineAppException {
        String commandLine = "L 1 2";
        CanvasCommandFactory.create(commandLine);
    }

    @Test(expected =CanvasCommandLineAppException.class)
    public void createShouldRaiseArgumentsNotEnoughException() throws CanvasCommandLineAppException {
        String commandLine = "L";
        CanvasCommandFactory.create(commandLine);
    }

    @Test(expected =CanvasCommandLineAppException.class)
    public void createShouldRaiseUnsupportedArgumentException() throws CanvasCommandLineAppException {
        String commandLine = "T 2 3";
        CanvasCommandFactory.create(commandLine);
    }
}
