package solid.lesson3_LSP.mediaplayer_violation;

public class WinampMediaPlayer extends MediaPlayer {
    @Override
    public void playVideo() throws VideoUnsupportedException {
        throw new VideoUnsupportedException();
    }
}
