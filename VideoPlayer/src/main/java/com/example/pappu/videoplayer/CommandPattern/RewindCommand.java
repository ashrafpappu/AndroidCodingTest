package com.example.pappu.videoplayer.CommandPattern;

public class RewindCommand implements Command {

    VideoPlayer videoPlayer;
    public RewindCommand(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.rewindVideo();
    }
}
