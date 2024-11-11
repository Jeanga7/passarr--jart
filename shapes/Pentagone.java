package shapes;

import java.awt.Color;

import Interfaces.Displayable;
import Interfaces.Drawable;
import core.Point;
import util.LineDrawer;

public class Pentagone implements Drawable {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private Point p5;
    private Color color;

    public Pentagone(Point p1, Point p2, Point p3, Point p4, Point p5) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.color = this.getColor();
    }


    @Override
    public void draw(Displayable displayable) {
        LineDrawer.drawLine(displayable, p1, p2, color);
        LineDrawer.drawLine(displayable, p2, p3, color);
        LineDrawer.drawLine(displayable, p3, p4, color);
        LineDrawer.drawLine(displayable, p4, p5, color);
        LineDrawer.drawLine(displayable, p5, p1, color);
    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}
