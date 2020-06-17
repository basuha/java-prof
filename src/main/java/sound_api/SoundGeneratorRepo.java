package sound_api;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.concurrent.TimeUnit;

public class SoundGeneratorRepo {
    protected static final AudioFormat audioFormat = new AudioFormat(44100, 8, 1, true, true);
    protected static final long duration = 1;
    protected static final TimeUnit timeUnit = TimeUnit.MINUTES;
    protected static SourceDataLine line = null;

    static {
        try {
            line = AudioSystem.getSourceDataLine(audioFormat);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    protected boolean playing = false;

}
