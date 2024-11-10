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

        // Save the image
        image.save("image.png");
    }
}
