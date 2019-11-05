package com.example.pappu.videoplayer.CommandPattern;

public class ForwardCommand implements Command {

    VideoPlayer videoPlayer;

    public ForwardCommand(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.forwardVideo();
    }
}
