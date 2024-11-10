package core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Interfaces.Displayable;

public class Image implements Displayable {
    private BufferedImage bufferedImage;
    private Graphics2D graphics;

    // creating image : doc link => https://stackoverflow.com/questions/20425507/how-to-create-image-in-java
    public Image(int width, int height) {
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        graphics = bufferedImage.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
    }

    @Override
    public void display(int x, int y, Color color) {
        graphics.setColor(color);
        graphics.fillOval(x, y, 5, 5);
    }

    // saving image : doc link => https://docs.oracle.com/javase/tutorial/2d/images/saveimage.html
    @Override
    public void save(String filename) {
        try {
            ImageIO.write(bufferedImage, "png", new File(filename));
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}

