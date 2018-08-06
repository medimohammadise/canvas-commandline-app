package com.springnature.codechallenge.canvascommandlineapp.canvasimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvas.CanvasShapes;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
/*
  concrete class for supporting draw rectangle using line class
 */
public class Rectangle implements CanvasShapes {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Line topLine;
    private Line buttomnLine;
    private Line leftLine;
    private Line rightLine;

    private char drawCharacter= Constants.CHAR_X;
    public Rectangle(int x1,int y1,int x2,int y2,char drawCharacter){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.drawCharacter=drawCharacter;

        topLine = new Line(x1, y1, x2, y1, Constants.CHAR_X);
        buttomnLine = new Line(x1, y2, x2, y2, Constants.CHAR_X);
        leftLine = new Line(x1, y1, x1, y2, Constants.CHAR_X);
        rightLine = new Line(x2, y1, x2, y2, Constants.CHAR_X);

    }
    @Override
    public void draw(Canvas convas) {
        topLine.draw(convas);
        buttomnLine.draw(convas);
        leftLine.draw(convas);
        rightLine.draw(convas);
    }
}
