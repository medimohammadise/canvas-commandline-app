package com.springnature.codechallenge.convascommandlineapp.commandimpl;

import com.springnature.codechallenge.convascommandlineapp.constant.Constants;
import com.springnature.codechallenge.convascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.convascommandlineapp.exception.CanvasCommandLineAppException;

public class CreateConvasImpl extends ConvasCommandImpl{
    private int width;
    private int height;

    public CreateConvasImpl(String[] commandArguments) throws CanvasCommandLineAppException {
        //pass command name to supper class
        super(Constants.COMMAND_CREATE_NEW_CONVAS);

        //for this command 2 argument is required
        if (commandArguments.length!=2)
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_NOT_ENOUGH);

        //this attributes should be derived from commandArguments
        try {
            width = Integer.parseInt(commandArguments[0]);
            height = Integer.parseInt(commandArguments[1]);
        }
        catch(NumberFormatException ex)
        {
            throw new CanvasCommandLineAppException(ErrorCodes.ARGUMENTS_VALUE_IS_NOT_VALID);
        }
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
