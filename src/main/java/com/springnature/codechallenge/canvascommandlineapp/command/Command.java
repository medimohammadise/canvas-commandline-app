package com.springnature.codechallenge.canvascommandlineapp.command;
/*
   We are relying on command interface based on SOLID principle
 */
public interface Command {

    //all commands has name (eg 'C','L','R')
    String getName();

    void draw();

}
