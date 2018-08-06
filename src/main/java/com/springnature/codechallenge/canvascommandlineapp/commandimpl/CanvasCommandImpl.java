package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.command.Command;
/**
 * This class is the parent concrete class for all other command classes
 */
public class CanvasCommandImpl implements Command {
    private String commandName;

    public CanvasCommandImpl(String commandName){
        this.commandName=commandName;
    }

    @Override
    public String getName() {
        return commandName;
    }

    @Override
    public void draw(Canvas canvas) {

    }
}
