package adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("song.mp3");

        MediaPlayer videoPlayer = new VideoAdapter(new VideoPlayerAPI());
        videoPlayer.play("movie.mp4");
    }
}
