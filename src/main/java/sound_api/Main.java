package sound_api;

import com.jgoodies.forms.layout.FormLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField frequencyTF;
    private JButton playB;
    private JButton stopB;
    private JSlider freqSlider;
    private JSlider durSlider;
    private JSpinner fadeSpinner;
    private JSpinner waveFormSpinner;
    private JSlider volumeSlider;
    private JSlider fadeSlider;
    private JSlider waveFormSlider;
    private JLabel freqLabel;
    private JLabel durLabel;
    private JLabel volLabel;
    private JLabel fadeLabel;
    private JLabel waveFormLabel;
    private JPanel imgPanel;
    private JButton buttonOK;
    private final CustomJPanel customJPanel = new CustomJPanel();
    private JLabel image;
    private SoundPlayer soundPlayer;
//    private final SoundGenerator soundGenerator = new SinWaveGenerator();
//    private final NewSoundGen newSoundGen = new NewSoundGen();

//    private final SwingWorker<Void, Void> worker = new SwingWorker<>() {
//        @Override
//        protected Void doInBackground() throws Exception {
//            soundGenerator.play(Integer.parseInt(frequencyTF.getText()));
//            return null;
//        }
//    };

//    SwingWorker<String, Void> worker2 = new SwingWorker<String, Void>() {
//        @Override
//        protected String doInBackground() throws Exception {
//            // Simulate doing something useful.
//            StringBuilder s = new StringBuilder("test");
//            for (int i = 0; i <= 10; i++) {
//                Thread.sleep(1000);
//                System.out.println(s.append(i));
//            }
//
//            // Here we can return some object of whatever type
//            // we specified for the first template parameter.
//            // (in this case we're auto-boxing 'true').
//            return s.toString();
//        }
//
//        // Can safely update the GUI from this method.
//        protected void done() {
//
//            String s;
//            try {
//                // Retrieve the return value of doInBackground.
//                s = get();
//            } catch (InterruptedException e) {
//                // This is thrown if the thread's interrupted.
//            } catch (ExecutionException e) {
//                // This is thrown if we throw an exception
//                // from doInBackground.
//            }
//        }
//
//
//    };

    private void initVolValue() {
        volLabel.setText(String.valueOf(volumeSlider.getValue()));
    }

    private void initDurValue() {
        durLabel.setText(durSlider.getValue() / 10d + " сек.");
    }

    private void initFreqValue() {
        freqLabel.setText(freqSlider.getValue() + " Hz");
    }

    private void initFadeValue() {
        switch (fadeSlider.getValue()) {
            case 0 -> fadeLabel.setText("нет");
            case 1 -> fadeLabel.setText("линейный");
            case 2 -> fadeLabel.setText("квадратный");
        }
    }

    private void initWaveForm() {
        switch (waveFormSlider.getValue()) {
            case 0 -> waveFormLabel.setText("sin");
            case 1 -> waveFormLabel.setText("square");
            case 2 -> waveFormLabel.setText("triangle");
            case 3 -> waveFormLabel.setText("sawtooth");
        }
    }

    public Main() throws InterruptedException {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        imgPanel.setLayout(new GridBagLayout());

        initDurValue();
        initFadeValue();
        initFreqValue();
        initVolValue();
        initWaveForm();

        volumeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initVolValue();
            }
        });

        durSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initDurValue();
            }
        });

        freqSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initFreqValue();
            }
        });

        waveFormSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initWaveForm();
            }
        });

        fadeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initFadeValue();
            }
        });

        playB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                soundPlayer = new SoundPlayer(
                        new Sound(freqSlider.getValue()
//                                , durSlider.getValue() / 10d
                                , 0.5
                                , volumeSlider.getValue()
                                , (byte) fadeSlider.getValue()
                                , (byte) waveFormSlider.getValue()));
                soundPlayer.play();
                draw(soundPlayer.getSoundData());
            }
        });
    }

    private void draw(double[] soundData) {
        imgPanel.removeAll();
        for (double d : soundData) {
            System.out.println(d);
        }
        final BufferedImage img = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
        for (int u = 0; u < 5; u++) {
            for (int i = 0; i < 1000; i += 2) {
                for (int j = 0; j < 1000; j += 2) {
                    img.setRGB(i,j, (int) soundData[i * u]);
                }
            }
        }

        image = new JLabel(new ImageIcon(img));
        imgPanel.add(image);
        imgPanel.updateUI();
        pack();
    }

    public static void main(String[] args) throws InterruptedException {
        Main dialog = new Main();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
