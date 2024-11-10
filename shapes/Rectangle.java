package shapes;

import Interfaces.Displayable;
import Interfaces.Drawable;
import core.Point;
import util.LineDrawer;

import java.awt.Color;

public class Rectangle implements Drawable {
    private final Point topLeft;
    private final Point bottomRight;
    private final Color color;

    public Rectangle(Point P1, Point P2) {
        this.topLeft = new Point(
                Math.min(P1.getX(), P2.getX()),
                Math.min(P1.getY(), P2.getY()));
        this.bottomRight = new Point(
                Math.max(P1.getX(), P2.getX()),
                Math.max(P1.getY(), P2.getY()));
        this.color = this.getColor();
    }
    public static Rectangle random(int maxWidth, int maxHeight) {
        Point P1 = Point.random(maxWidth, maxHeight);
        Point P2 = Point.random(maxWidth, maxHeight);
        return new Rectangle(P1, P2);
    }

    @Override
    public void draw(Displayable displayable) {
        Point topRight = new Point(bottomRight.getX(), topLeft.getY());
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY());

        LineDrawer.drawLine(displayable, topLeft, topRight, color);
        LineDrawer.drawLine(displayable, topRight, bottomRight, color);
        LineDrawer.drawLine(displayable, bottomRight, bottomLeft, color);
        LineDrawer.drawLine(displayable, bottomLeft, topLeft, color);
    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}