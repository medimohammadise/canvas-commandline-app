package com.springnature.codechallenge.convascommandlineapp.canvasimpl;

import com.springnature.codechallenge.convascommandlineapp.command.Command;
import com.springnature.codechallenge.convascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.convascommandlineapp.commandimpl.CreateConvasImpl;

import java.util.ArrayList;
import java.util.List;

public class CanvasImpl implements Canvas {
    private List<Command> commandList= new ArrayList<>();;
    private char[][] elements;

    private int width;

    private int height;

    public CanvasImpl(CreateConvasImpl createConvas){
        this.width=createConvas.getWidth();
        this.height=createConvas.getHeight();
        this.addCommandToConvasCommandList(createConvas);
    }


    @Override
    public void display() {

    }

    @Override
    public void addCommandToConvasCommandList(Command command) {
        commandList.add(command);
    }

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }

    @Override
    public void setElement(int x, int y, char c) {
        elements[x][y]=c;
    }

    @Override
    public Character getElement(int x, int y) {
        return elements[x][y];
    }

}
