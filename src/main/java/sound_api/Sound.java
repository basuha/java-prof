package sound_api;

public class Sound {
    private double frequency;
    private double duration;
    private double volume;
    private byte fadeEnd;
    private byte wave;

    public Sound(double frequency, double duration, double volume, byte fadeEnd, byte wave) {
        this.frequency = frequency;
        this.duration = duration;
        this.volume = volume;
        this.fadeEnd = fadeEnd;
        this.wave = wave;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public byte getFadeEnd() {
        return fadeEnd;
    }

    public void setFadeEnd(byte fadeEnd) {
        this.fadeEnd = fadeEnd;
    }

    public byte getWave() {
        return wave;
    }

    public void setWave(byte wave) {
        this.wave = wave;
    }
}
