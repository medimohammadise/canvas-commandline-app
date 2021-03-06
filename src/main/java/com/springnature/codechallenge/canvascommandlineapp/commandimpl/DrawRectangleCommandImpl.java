package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvasimpl.Line;
import com.springnature.codechallenge.canvascommandlineapp.canvasimpl.Rectangle;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;

/*
   This class validates and create command after Draw Rectangle (R) command
 */
public class DrawRectangleCommandImpl extends CanvasCommandImpl {
    Rectangle rectangle;

    public DrawRectangleCommandImpl(String[] commandArguments) throws CanvasCommandLineAppException {
        //pass command name to supper class
        super(Constants.COMMAND_DRAW_NEW_RECTANGLE);
        int x1,y1,x2,y2;

        //for this command 2 argument is required
        if (commandArguments.length!=4)
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_NOT_ENOUGH);

        //this attributes should be derived from commandArguments
        try {
            x1 = Integer.parseInt(commandArguments[0]);
            y1 = Integer.parseInt(commandArguments[1]);
            x2 = Integer.parseInt(commandArguments[2]);
            y2 = Integer.parseInt(commandArguments[3]);

        }
        catch(NumberFormatException ex)
        {
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_VALUE_IS_NOT_VALID);
        }
        rectangle=new Rectangle(x1,y1,x2,y2,Constants.CHAR_X);
    }
    @Override
    public void draw(Canvas canvas) {
        this.rectangle.draw(canvas);
    }



}
