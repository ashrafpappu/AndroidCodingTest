import com.example.pappu.videoplayer.CommandPattern.Command;
import com.example.pappu.videoplayer.CommandPattern.ForwardCommand;
import com.example.pappu.videoplayer.CommandPattern.PlayCommand;
import com.example.pappu.videoplayer.CommandPattern.RewindCommand;
import com.example.pappu.videoplayer.CommandPattern.VideoPlayer;
import com.example.pappu.videoplayer.CommandPattern.VideoPlayerController;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VideoPlayerTest {

    static VideoPlayerController videoPlayerController = null;
    static Command playCommand = null;
    static  Command forwardCommand = null;
    static Command rewindCommand = null;
    @BeforeAll
    static void init(){
        videoPlayerController = new VideoPlayerController();
        VideoPlayer videoPlayer = new VideoPlayer();
        playCommand = new PlayCommand(videoPlayer);
        forwardCommand = new ForwardCommand(videoPlayer);
        rewindCommand = new RewindCommand(videoPlayer);
    }

    @DisplayName("player play button check")
    @Test
    public void play(){

        videoPlayerController.setCommand(playCommand);
        assertTrue(videoPlayerController.executeCommand());

    }

    @DisplayName("player forward button check")
    @Test
    public void forward(){

        videoPlayerController.setCommand(forwardCommand);
        assertTrue(videoPlayerController.executeCommand());

    }

    @DisplayName("player rewind button check")
    @Test
    public void rewind(){

        videoPlayerController.setCommand(rewindCommand);
        assertTrue(videoPlayerController.executeCommand());

    }

}
