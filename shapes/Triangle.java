package shapes;
import java.awt.Color;
import Interfaces.Displayable;
import Interfaces.Drawable;
import core.Point;
import util.LineDrawer;
public class Triangle implements Drawable {
    private Point p1;
    private Point p2;
    private Point p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = this.getColor();
    }
    public static Triangle random(int width, int height) {
        Point p1 = Point.random(width, height);
        Point p2 = Point.random(width, height);
        Point p3 = Point.random(width, height);
        return new Triangle(p1, p2, p3);
    }

    @Override
    public void draw(Displayable displayable) {
        LineDrawer.drawLine(displayable, p1, p2, color);
        LineDrawer.drawLine(displayable, p2, p3, color);
        LineDrawer.drawLine(displayable, p3, p1, color);
    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}