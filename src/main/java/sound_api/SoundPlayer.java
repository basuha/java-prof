package sound_api;

public class SoundPlayer {
    private Sound sound;

    public SoundPlayer(Sound sound) {
        this.sound = sound;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public void play() {
        NewSoundGen.playSound(sound.getFrequency()
                , sound.getDuration()
                , sound.getVolume()
                , sound.getFadeEnd()
                , sound.getWave());
    }

    public double[] getSoundData() {
        return NewSoundGen.generateSoundData(sound.getFrequency()
                , sound.getDuration()
                , sound.getVolume()
                , sound.getFadeEnd()
                , sound.getWave());
    }
}
