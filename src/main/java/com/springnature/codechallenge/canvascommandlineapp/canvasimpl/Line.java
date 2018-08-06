package com.springnature.codechallenge.canvascommandlineapp.canvasimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvas.CanvasShapes;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
/*
   concrete class for supporting draw line
 */
public class Line implements CanvasShapes {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private char drawCharacter = Constants.CHAR_DASH;

    public Line(int x1, int y1, int x2, int y2, char drawCharacter) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.drawCharacter = drawCharacter;

    }

    @Override
    public void draw(Canvas canvas) {
        //if it is horizontal
        if (y1 == y2) {
            for (int i = x1; i <= x2; i++) {
                canvas.setElement(i, y1, drawCharacter);
            }
        } else if (x1 == x2) {
            //if it is vertical
            for (int i = y1; i <= y2; i++) {
                canvas.setElement(x1, i, drawCharacter);
            }
        }
    }
}
