package com.springnature.codechallenge.convascommandlineapp.exception;

import com.springnature.codechallenge.convascommandlineapp.constant.ErrorCodes;

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
