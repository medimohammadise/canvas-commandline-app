package com.springnature.codechallenge.canvascommandlineapp.canvasimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.command.Command;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;

import java.util.ArrayList;
import java.util.List;
/*
 This class is the concrete class for Convas
 */
public class CanvasImpl implements Canvas {
    private List<Command> commandList= new ArrayList<>();;
    private char[][] elements;

    private int width;

    private int height;

    public CanvasImpl(CreateCanvasImpl createConvas){
        this.width=createConvas.getWidth();
        this.height=createConvas.getHeight();
        this.addCommandToConvasCommandList(createConvas);
        this.initElements();
    }

    private void initElements() {
        elements= new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                elements[i][j] = ' ';
            }
        }
    }

    @Override
    public void display() {
      this.displayHorizontalBorder();

    }
    private void displayHorizontalBorder() {
        for (int i = 0; i < this.width+ 2; i++) {
            System.out.print(Constants.CHAR_DASH);
        }
        printNewLine();
    }

    private void printNewLine() {
        System.out.println();
    }


    @Override
    public void addCommandToConvasCommandList(Command command) {
        commandList.add(command);
        command.draw();
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
