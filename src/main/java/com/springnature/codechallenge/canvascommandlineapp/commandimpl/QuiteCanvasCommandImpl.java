package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
/*
   This class creates Quite Commnad Object, as of now we just quiting the app after this command is being created
 */
public class QuiteCanvasCommandImpl extends CanvasCommandImpl {
    public QuiteCanvasCommandImpl(){
      super(Constants.COMMAND_QUIT);
    }
}
