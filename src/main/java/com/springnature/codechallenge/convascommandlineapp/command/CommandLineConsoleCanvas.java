package com.springnature.codechallenge.convascommandlineapp.command;



import com.springnature.codechallenge.convascommandlineapp.constant.Constants;

import java.util.Scanner;

/**
 * CommandLineConsoleCanvas handle the reading of command lines in the console.
 * It verifies command and also  keep listening for commands until the command "Q" is entered.
 */
public class CommandLineConsoleCanvas {


    public void run() {
        String commandLine;
        Scanner scanIn = new Scanner(System.in);
        // Start reading for drawing commands until quit command
        do {
            Command command = null;
            System.out.print(Constants.PRMPOT_COMMAND);
            commandLine = scanIn.nextLine();
            try {
                command = CanvasCommandFactory.create(commandLine);
                //TODO process command based on command type, first command should be C (Create Convas)
            } catch (Exception exception) {
                System.out.println(Constants.ERROR_WRONG_COMMAND);
            }
        } while (
            !Constants.COMMAND_QUIT.equals(commandLine)
            );
        scanIn.close();
    }
}
