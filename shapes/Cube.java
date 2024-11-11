package shapes;

import java.awt.Color;

import Interfaces.Displayable;
import Interfaces.Drawable;
import core.Point;
import util.LineDrawer;

public class Cube implements Drawable {
    private Point p1;
    private Point p2;
    private Color color;

    public Cube(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = this.getColor();
    }

    @Override
    public void draw(Displayable displayable) {
        Point p1 = new Point(this.p1.getX(), this.p1.getY());
        Point p2 = new Point(this.p2.getX(), this.p2.getY());
        Point p3 = new Point(this.p1.getX(), this.p2.getY());
        Point p4 = new Point(this.p2.getX(), this.p1.getY());

        LineDrawer.drawLine(displayable, p1, p3, color);
        LineDrawer.drawLine(displayable, p1, p4, color);
        LineDrawer.drawLine(displayable, p2, p3, color);
        LineDrawer.drawLine(displayable, p2, p4, color);

        int dx =  (int) Math.round(Math.abs((double) p1.getX() - p2.getX()) / 2);
        int dy =  (int) Math.round(Math.abs((double) p1.getY() - p2.getY()) / 2);

        Point p1_translate = new Point(p1.getX()+dx, p1.getY()+dy);
        Point p2_translate = new Point(p2.getX()+dx, p2.getY()+dy);
        
        Point p3_translate = new Point(p1_translate.getX(), p2_translate.getY());
        Point p4_translate = new Point(p2_translate.getX(), p1_translate.getY());

        LineDrawer.drawLine(displayable, p1_translate, p3_translate, color);
        LineDrawer.drawLine(displayable, p1_translate, p4_translate, color);
        LineDrawer.drawLine(displayable, p2_translate, p3_translate, color);
        LineDrawer.drawLine(displayable, p2_translate, p4_translate, color);

        LineDrawer.drawLine(displayable, p1, p1_translate, color);
        LineDrawer.drawLine(displayable, p2, p2_translate, color);
        LineDrawer.drawLine(displayable, p3, p3_translate, color);
        LineDrawer.drawLine(displayable, p4, p4_translate, color);


    }

    @Override
    public Color getColor() {
        return new Color((int) (Math.random() * 0xFFFFFF));
    }
}
