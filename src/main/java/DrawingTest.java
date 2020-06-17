import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class DrawingTest {
    private final static int MAX = 999_999;
    private final static int MIN = 100_000;
    private final static int IMAGE_WIDTH = 50;
    private final static int IMAGE_HEIGHT = 10;
    private final static int FONT_SIZE = 12;
    private final static int TEXT_COORD_X = 0;
    private final static int TEXT_COORD_Y = 10;
    private final static String FILEPATH_TO_SAVE = "image.png";

    public static void main(String[] args) {

        BufferedImage image = new BufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = image.createGraphics();
        g2.setFont(new Font("SansSerif", Font.PLAIN, FONT_SIZE));

        g2.drawString(getRandomNumber().toString(), TEXT_COORD_X, TEXT_COORD_Y);

        g2.drawImage(image, 1, 1, new Color(123,44,25), (img, infoflags, x, y, width, height) -> false);

        try {
            ImageIO.write(image, "png", new File(FILEPATH_TO_SAVE));
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private static Integer getRandomNumber() {
        Random random = new Random();
        return random.nextInt((MAX - MIN) + 1) + MIN;
    }
}