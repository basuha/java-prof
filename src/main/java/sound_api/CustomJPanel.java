package sound_api;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CustomJPanel extends JPanel {

    BufferedImage image = null;

    public CustomJPanel() {

    }

    @Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        System.out.println(image);
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        repaint();
    }
}