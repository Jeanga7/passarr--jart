import core.*;
import shapes.*;

public class jart {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);

        // Draw rectangle
        for (int i = 0; i< 2; i++){
            Point P1 = Point.random(image.getWidth(), image.getHeight());
            Point P2 = Point.random(image.getWidth(), image.getHeight());
            var rectangle = new Rectangle(P1, P2);
            rectangle.draw(image);
        }

        //draw lines
        for (int i = 0; i < 3; i++) {
            Line line = Line.random(image.getWidth(), image.getHeight());
            line.draw(image);
        }

        // Draw triangle
        for (int i = 0; i < 5; i++) {
            Point p1 = Point.random(image.getWidth(), image.getHeight());
            Point p2 = Point.random(image.getWidth(), image.getHeight());
            Point p3 = Point.random(image.getWidth(), image.getHeight());
            var triangle = new Triangle(p1, p2, p3);
            triangle.draw(image);
        }

        // Draw random circles
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        // Draw Pentagone
        for (int i = 0; i <= 2; i++) {
            Point p1 = new Point(500 - 30 * i, 250 - 6 * i);
            Point p2 = new Point(700 - 30 * i, 400 - 6 * i);
            Point p3 = new Point(650 - 30 * i, 600 - 6 * i);
            Point p4 = new Point(450 - 30 * i, 600 - 6 * i);
            Point p5 = new Point(300 - 30 * i, 400 - 6 * i);
            var pentagone = new Pentagone(p1, p2, p3, p4, p5);
            pentagone.draw(image);
        }
        // Draw Cube
        Point p1 = new Point(300,300);
        Point p2 = new Point(50,50);
        var cube = new Cube(p1, p2);
        cube.draw(image);

        // Save the image
        image.save("image.png");
    }
}
