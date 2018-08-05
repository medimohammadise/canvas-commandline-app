package com.springnature.codechallenge.canvascommandlineapp.exception;

import com.springnature.codechallenge.canvascommandlineapp.constant.ErrorCodes;
/*
  This Exception class is being used in entire system as a conventional and custom exception class
 */
public class CanvasCommandLineAppException extends Exception {
    private final int code;
    public CanvasCommandLineAppException(ErrorCodes errorCode){
        super(errorCode.getDescription());
        this.code=errorCode.getCode();
    }
    public int getCode() {
        return code;
    }
}
