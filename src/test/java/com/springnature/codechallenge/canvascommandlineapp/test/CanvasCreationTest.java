package com.springnature.codechallenge.canvascommandlineapp.test;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvasimpl.CanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasCommandImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanvasCreationTest {
    Canvas canvas;

    @Before
    public void setUp() throws Exception {
        String[] commandLineArguments = {"20", "4"};
        CreateCanvasCommandImpl createCanvasCommand = new CreateCanvasCommandImpl(commandLineArguments);
        canvas = new CanvasImpl(createCanvasCommand);
    }

    @Test
    public void newCanvasShouldCreateAreaWithRightWidthAndHeightAndHasOneCommand() {

        assertEquals(22, canvas.getWidth()); // we intentionally adding 2 for width and height so we expect 22
        assertEquals(6, canvas.getHeight()); // we intentionally adding 2 for width and height so we expect 6
        assertEquals(1, canvas.getCommandList().size());
        assertEquals(Constants.COMMAND_CREATE_NEW_CANVAS, canvas.getCommandList().get(0).getName());
    }

}
