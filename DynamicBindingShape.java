class ShapeDynamic {
       double area(){
            System.out.println("Shape area not defined");
            return 0;
       }
}
 
class CircleDynamic extends ShapeDynamic {
    double radius;

    CircleDynamic(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleDynamic extends ShapeDynamic {
    double length, width;

    RectangleDynamic(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class DynamicBindingShape {
    public static void main(String[] args) {
  
     ShapeDynamic shape;

        shape = new CircleDynamic(3);
        System.out.println("Circle Area (Dynamic): " + shape.area());

        shape = new RectangleDynamic(4, 5);
        System.out.println("Rectangle Area (Dynamic): " + shape.area());
    }
}
