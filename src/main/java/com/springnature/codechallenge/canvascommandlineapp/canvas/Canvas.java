package com.springnature.codechallenge.canvascommandlineapp.canvas;

import com.springnature.codechallenge.canvascommandlineapp.command.Command;

import java.util.List;
/*
   We are relying on Canvas interface based on SOLID principle
 */
public interface Canvas {
    int getWidth();
    int getHeight();
    void display();
    void addCommandToConvasCommandList(Command command);
    List<Command> getCommandList();
    void setElement(int x, int y, char c);
    Character getElement(int x, int y);
}
