package shapes;

import Interfaces.Displayable;
import Interfaces.Drawable;
import java.awt.Color;
import util.*;
import core.*;

public class Line implements Drawable {

    private Point start;
    private Point end;
    private Color color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = getColor();
    }

    @Override
    public void draw(Displayable displayable) {
        Point p1 = new Point(start.getX(), start.getY());
        Point p2 = new Point(end.getX(), end.getY());
        LineDrawer.drawLine(displayable, p1, p2, color);
    }

    public static Line random(int maxWidth, int maxHeight) {
        Point p1 = Point.random(maxWidth, maxHeight);
        Point p2 = Point.random(maxWidth, maxHeight);
        return new Line(p1, p2);
    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}
