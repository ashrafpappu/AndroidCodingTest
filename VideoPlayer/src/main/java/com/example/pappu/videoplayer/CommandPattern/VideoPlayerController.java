package com.example.pappu.videoplayer.CommandPattern;

public class VideoPlayerController {

    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public boolean executeCommand(){
        command.execute();
        return true;
    }
}
