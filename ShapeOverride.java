class Shape {
    void display() {
        System.out.println("Displaying a generic shape.");
    }
}

class CircleShape extends Shape {
    @Override
    void display() {
        System.out.println("Displaying a circle.");
    }
}

class RectangleShape extends Shape {
    @Override
    void display() {
        System.out.println("Displaying a rectangle.");
    }
}

public class ShapeOverride {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        Shape rectangle = new RectangleShape();

        circle.display();
        rectangle.display();
    }
}
