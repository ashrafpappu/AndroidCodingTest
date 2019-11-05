package com.example.pappu.videoplayer;

import com.example.pappu.videoplayer.CommandPattern.Command;
import com.example.pappu.videoplayer.CommandPattern.ForwardCommand;
import com.example.pappu.videoplayer.CommandPattern.PlayCommand;
import com.example.pappu.videoplayer.CommandPattern.RewindCommand;
import com.example.pappu.videoplayer.CommandPattern.VideoPlayer;
import com.example.pappu.videoplayer.CommandPattern.VideoPlayerController;

public class MainClass {

    public  static void main(String[] args){

        VideoPlayerController videoPlayerController = new VideoPlayerController();
        VideoPlayer videoPlayer = new VideoPlayer();
        Command playCommand = new PlayCommand(videoPlayer);
        Command forwardCommand = new ForwardCommand(videoPlayer);
        Command rewindCommand = new RewindCommand(videoPlayer);


        videoPlayerController.setCommand(playCommand);
        videoPlayerController.executeCommand();


        videoPlayerController.setCommand(forwardCommand);
        videoPlayerController.executeCommand();

        videoPlayerController.setCommand(rewindCommand);
        videoPlayerController.executeCommand();
    }
}
