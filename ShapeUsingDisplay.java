import java.util.*;

class Shape {
    void display() {
        System.out.println("Displaying a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        super.display();  // Calls Shape's display() method
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void display() {
        super.display();  // Calls Shape's display() method
        System.out.println("This is a Rectangle.");
    }
}

public class ShapeUsingDisplay {
    public static void main(String[] args) {
    
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Output:");
        c.display();

        System.out.println("\nRectangle Output:");
        r.display();
    }
}