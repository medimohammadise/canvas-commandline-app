package com.springnature.codechallenge.canvascommandlineapp.constant;
/*
   Keeping all error codes for the system
 */
public enum ErrorCodes {
    ARGUMENTS_NOT_ENOUGH(1,"Arguments for command is not enough!"),
    UNSUPPORTED_OR_WRONG_COMMAND_LINE(2,"Command line is wrong or unsupported!"),
    ARGUMENTS_VALUE_IS_NOT_VALID(3,"Argument value is not valid." ),
    THERE_IS_NO_CANVAS(4, "There is no canvas please create it first using C x,y command");


    private final int code;
    private final String description;

    private ErrorCodes(int code,String description){
        this.code=code;
        this.description=description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
