package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;

/*
   This class validates and create command after Draw Rectangle (R) command
 */
public class BucketFillCommandImpl extends CanvasCommandImpl {
    private int x;
    private int y;
    private char color;
    public BucketFillCommandImpl(String[] commandArguments) throws CanvasCommandLineAppException {
        //pass command name to supper class
        super(Constants.COMMAND_BUCKET_FILL);
        //for this command 2 argument is required
        if (commandArguments.length!=3)
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_NOT_ENOUGH);

        //this attributes should be derived from commandArguments
        try {
            x = Integer.parseInt(commandArguments[0]);
            y = Integer.parseInt(commandArguments[1]);

        }
        catch(NumberFormatException ex)
        {
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_VALUE_IS_NOT_VALID);
        }
        color = commandArguments[2].charAt(0);

    }
    @Override
    public void draw(Canvas canvas) {

        doFillBucketWithColor(canvas,x,y,color);
    }
    public void doFillBucketWithColor(Canvas canvas, int x, int y, char color) {
        if (Constants.CHAR_X==canvas.getElement(x, y) || canvas.getElement(x, y).equals(color) || canvas.getElement(x, y)==Constants.CHAR_PIP|| canvas.getElement(x, y)==Constants.CHAR_DASH) {
            return;
        }
        if (x >= 1 && x < canvas.getWidth()  && y >= 1 && y < canvas.getHeight()) {
            if (canvas.getElement(x, y)== Constants.CHAR_SPACE) {
                canvas.setElement(x, y, color);
            }
            //fill adjucent canvas elements also
            doFillBucketWithColor(canvas, x-1, y, color);
            doFillBucketWithColor(canvas, x + 1, y, color);
            doFillBucketWithColor(canvas,  x, y-1,color);
            doFillBucketWithColor(canvas,  x, y+1,color);
        }
    }


}
