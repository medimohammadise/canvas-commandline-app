package com.springnature.codechallenge.canvascommandlineapp.command;



import com.springnature.codechallenge.canvascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.canvascommandlineapp.canvasimpl.CanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.CreateCanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.commandimpl.QuiteCanvasImpl;
import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
import com.springnature.codechallenge.canvascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.canvascommandlineapp.exception.CanvasCommandLineAppException;

import java.util.Scanner;

/**
 * CommandLineConsoleCanvas handle the reading of command lines in the console.
 * It verifies command and also  keep listening for commands until the command "Q" is entered.
 */
public class CommandLineConsoleCanvas {


    public void run() {
        Canvas canvas=null;
        String commandLine;
        Scanner scanIn = new Scanner(System.in);
        // Start reading for drawing commands until quit command
        do {
            Command command = null;
            System.out.print(Constants.PRMPOT_COMMAND);
            commandLine = scanIn.nextLine();
            try {
                command = CanvasCommandFactory.create(commandLine);
                if (!(command instanceof QuiteCanvasImpl))
                {
                    if (canvas == null && !(command instanceof CreateCanvasImpl))
                        throw new CanvasCommandLineAppException(ErrorCodes.THERE_IS_NO_CANVAS);
                    else if (command instanceof CreateCanvasImpl)
                        canvas = new CanvasImpl((CreateCanvasImpl) command);
                    else
                        canvas.addCommandToConvasCommandList(command);
                }
            } catch (CanvasCommandLineAppException exception) {

                System.out.println(exception.getMessage());
            }
        } while (
            !Constants.COMMAND_QUIT.equals(commandLine)
            );
        scanIn.close();
    }
}
