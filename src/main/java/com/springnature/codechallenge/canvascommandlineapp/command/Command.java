package com.springnature.codechallenge.canvascommandlineapp.command;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;

/*
   We are relying on command interface based on SOLID principle
 */
public interface Command {

    //all commands has name (eg 'C','L','R')
    String getName();

    void draw(Canvas canvas);

}
