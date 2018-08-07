package com.springnature.codechallenge.canvascommandlineapp.test;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvasimpl.CanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.command.CanvasCommandFactory;
import com.springnature.codechallenge.canvascommandlineapp.command.Command;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasCommandImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CanvasCommandTest {
    static Canvas canvas;

    @Before
    public void setUp() throws Exception {
        //I'm intentionally doing this because I want to use canvas from previous testes to better see the result
        //for running multiple commands
        if (canvas == null) {
            String[] commandLineArguments = {"20", "4"};
            CreateCanvasCommandImpl createCanvasCommand = new CreateCanvasCommandImpl(commandLineArguments);
            canvas = new CanvasImpl(createCanvasCommand);
        }
    }

    @Test
    public void drawHorizontalLineCommandShouldWork() throws CanvasCommandLineAppException {

        String commandLine = "L 1 2 6 2";
        Command command = CanvasCommandFactory.create(commandLine);
        canvas.addCommandToCanvasCommandList(command);
        assertEquals(Constants.COMMAND_DRAW_NEW_LINE, command.getName());
    }

    @Test
    public void drawVerticalLineCommandShouldWork() throws CanvasCommandLineAppException {

        String commandLine = "L 6 3 6 4";
        Command command = CanvasCommandFactory.create(commandLine);
        canvas.addCommandToCanvasCommandList(command);
        assertEquals(Constants.COMMAND_DRAW_NEW_LINE, command.getName());
    }
    @Test
    public void drawRectangleCommandShouldWork() throws CanvasCommandLineAppException {

        String commandLine = "R 16 1 20 3";
        Command command = CanvasCommandFactory.create(commandLine);
        canvas.addCommandToCanvasCommandList(command);
        assertEquals(Constants.COMMAND_DRAW_NEW_RECTANGLE, command.getName());
    }

    @Test
    public void fillBucketCommandShouldWork() throws CanvasCommandLineAppException {

        String commandLine = "B 10 3 o";
        Command command = CanvasCommandFactory.create(commandLine);
        canvas.addCommandToCanvasCommandList(command);
        assertEquals(Constants.COMMAND_BUCKET_FILL, command.getName());
    }

    @Test
    public void quiteCommandShouldWork() throws CanvasCommandLineAppException {

        String commandLine = "Q";
        Command command = CanvasCommandFactory.create(commandLine);
        canvas.addCommandToCanvasCommandList(command);
        assertEquals(Constants.COMMAND_QUIT, command.getName());
    }
}
