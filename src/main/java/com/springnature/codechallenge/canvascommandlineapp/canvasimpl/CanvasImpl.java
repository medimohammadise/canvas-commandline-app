package com.springnature.codechallenge.canvascommandlineapp.canvasimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.command.Command;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasCommandImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;

import java.util.ArrayList;
import java.util.List;
/*
 This class is the concrete class for Canvas
 */
public class CanvasImpl implements Canvas {
    private List<Command> commandList= new ArrayList<>();;
    private char[][] elements;

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    private int width;

    private int height;

    public CanvasImpl(CreateCanvasCommandImpl createConvas){
        this.width=createConvas.getWidth()+2;     //I'm intentionally doing this (Plus2) because of display requirement for canvas width (top and bottom border) for simplifying canvas display
        this.height=createConvas.getHeight()+2;  //I'm intentionally doing this (Plus2) because of display requirement for canvas height (left and right border) for simplifying canvas display
        this.initElements();
        this.addCommandToConvasCommandList(createConvas);

    }

    private void initElements() {
        elements= new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                //set  canvas borders
                if (y==0 || y==height-1 )
                    elements[x][y] = Constants.CHAR_DASH;
                else
                if( x==0 || x==width-1 )
                    elements[x][y] = Constants.CHAR_PIP;
                else
                elements[x][y] = Constants.CHAR_SPACE;

            }
        }
    }

    private void printNewLine() {
        System.out.println();
    }


    @Override
    public void display() {
        for (int y = 0; y < height ; y++) {
            for (int x = 0; x <width ; x++) {
                System.out.print(getElement(x, y));
            }
            printNewLine();
        }
    }

    @Override
    public void addCommandToConvasCommandList(Command command) {
        commandList.add(command);
        //new command is just affecting in canvas by draw method we do not know what is that affect? (separation of concerns)
        command.draw(this);
        //the canvas just blindly rendering it'sstate
        this.display();
    }

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }

    @Override
    public void setElement(int x, int y, char c) {
        if (x>=0&&x<width && y>=0&&y<height)
            elements[x][y]=c;
    }

    @Override
    public Character getElement(int x, int y) {
        return elements[x][y];
    }

}
