import core.Point;


public class jart {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        
        // Draw rectangle
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        
        // Draw triangle
        Triangle triangle = new Triangle(
            new Point(100, 100),
            new Point(900, 900),
            new Point(100, 900)
        );
        triangle.draw(image);
        
        // Draw random circles
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }
        
        // Save the image
        image.save("image.png");
    }
}
