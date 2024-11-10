package shapes;

import core.Point;
import Interfaces.Displayable;
import Interfaces.Drawable;
import java.awt.Color;

public class Circle implements Drawable {

    private final Point center;
    private final int radius;
    private final Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = this.getColor();
    }

    public static Circle random(int maxWidth, int maxHeight) {
        return new Circle(
            Point.random(maxWidth, maxHeight),
            (int) ((Math.random() * Math.min(maxWidth, maxHeight)) / 10)
        );
    }

    @Override
    public void draw(Displayable displayable) {
        int x = 0;
        int y = radius;
        int d = 3 - 2 * radius;

        while (y >= x) {
            displayable.display(center.getX() + x, center.getY() + y, color);
            displayable.display(center.getX() - x, center.getY() + y, color);
            displayable.display(center.getX() + x, center.getY() - y, color);
            displayable.display(center.getX() - x, center.getY() - y, color);
            displayable.display(center.getX() + y, center.getY() + x, color);
            displayable.display(center.getX() - y, center.getY() + x, color);
            displayable.display(center.getX() + y, center.getY() - x, color);
            displayable.display(center.getX() - y, center.getY() - x, color);

            if (d < 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}