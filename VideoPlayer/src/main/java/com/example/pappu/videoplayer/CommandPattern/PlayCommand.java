package com.example.pappu.videoplayer.CommandPattern;

public class PlayCommand implements Command {

    VideoPlayer videoPlayer;

    public PlayCommand(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.playVideo();
    }
}
