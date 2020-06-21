package solid.lesson3_LSP.mediaplayer_violation;

public class MediaPlayer {
    public void playAudio() {
        System.out.println("playing audio");
    }

    public void playVideo() throws VideoUnsupportedException {
        System.out.println("play video");
    }
}
