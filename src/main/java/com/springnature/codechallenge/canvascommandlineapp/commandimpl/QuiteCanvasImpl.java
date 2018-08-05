package com.springnature.codechallenge.canvascommandlineapp.commandimpl;

import com.springnature.codechallenge.canvascommandlineapp.constant.Constants;
/*
   This class creates Quite Commnad Object, as of now we just quiting the app after this command is being created
 */
public class QuiteCanvasImpl extends ConvasCommandImpl {
    public QuiteCanvasImpl(){
      super(Constants.COMMAND_QUIT);
    }
}
