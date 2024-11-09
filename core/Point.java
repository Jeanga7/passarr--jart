package core;

import java.awt.Color;

import Interfaces.Displayable;
import Interfaces.Drawable;

public class Point implements Drawable {
    private int x, y;
    private Color color;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    }

    public static Point random(int width, int height) {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}