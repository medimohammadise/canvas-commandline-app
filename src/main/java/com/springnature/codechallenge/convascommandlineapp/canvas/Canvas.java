package com.springnature.codechallenge.convascommandlineapp.canvas;

import com.springnature.codechallenge.convascommandlineapp.command.Command;

import java.util.List;

public interface Canvas {
    void display();
    void addCommandToConvasCommandList(Command command);
    List<Command> getCommandList();
    void setElement(int x, int y, char c);
    Character getElement(int x, int y);
}
