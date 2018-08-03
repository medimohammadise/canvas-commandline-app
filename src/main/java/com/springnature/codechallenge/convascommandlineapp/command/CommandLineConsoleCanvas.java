package com.springnature.codechallenge.convascommandlineapp.command;



import com.springnature.codechallenge.convascommandlineapp.canvas.Canvas;
import com.springnature.codechallenge.convascommandlineapp.canvasimpl.CanvasImpl;
import com.springnature.codechallenge.convascommandlineapp.commandimpl.CreateConvasImpl;
import com.springnature.codechallenge.convascommandlineapp.commandimpl.QuiteConvasImpl;
import com.springnature.codechallenge.convascommandlineapp.constant.Constants;
import com.springnature.codechallenge.convascommandlineapp.constant.ErrorCodes;
import com.springnature.codechallenge.convascommandlineapp.exception.CanvasCommandLineAppException;

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
                if (!(command instanceof QuiteConvasImpl))
                {
                    if (canvas == null && !(command instanceof CreateConvasImpl))
                        throw new CanvasCommandLineAppException(ErrorCodes.THERE_IS_NO_CANVAS);
                    else if (command instanceof CreateConvasImpl)
                        canvas = new CanvasImpl((CreateConvasImpl) command);
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
