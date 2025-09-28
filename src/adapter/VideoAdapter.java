package adapter;

public class VideoAdapter implements MediaPlayer {
    private final VideoPlayerAPI videoPlayer;

    public VideoAdapter(VideoPlayerAPI videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String filename) {
        videoPlayer.playVideoFile(filename);
    }
}