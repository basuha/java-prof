package solid.lesson3_LSP.mediaplayer_solution;

import solid.lesson3_LSP.mediaplayer_violation.MediaPlayer;
import solid.lesson3_LSP.mediaplayer_violation.TorMediaPlayer;
import solid.lesson3_LSP.mediaplayer_violation.VideoUnsupportedException;
import solid.lesson3_LSP.mediaplayer_violation.VlcMediaPlayer;
import solid.lesson3_LSP.mediaplayer_violation.WinampMediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    public static void main(String[] args) throws solid.lesson3_LSP.mediaplayer_violation.VideoUnsupportedException {
        List<solid.lesson3_LSP.mediaplayer_violation.MediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("=======================");

        allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

    }

    public static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) throws VideoUnsupportedException {
        for (var player : allPlayers) {
            player.playVideo();
        }
    }
}
