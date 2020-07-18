package J05PolymorphicAndAbstract;

public class Polymorphism45 {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(3.4, 5.3);
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(7.4, 4.3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
        }
    }
}

interface IShape {
    double getArea();
    double getPerimeter();
}

class Rectangle implements IShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
}

class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}