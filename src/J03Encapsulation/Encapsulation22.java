package J03Encapsulation;
/*
                Rectangle
-length: double
-width: double
+Rectangle
+Rectangle(length: double, width: double)
+setLength(length: double): void
+getLength(): double
+setWidth(width: double): void
+getWidth(): double
+getArea(): double
+getPerimeter(): double
*/
public class Encapsulation22 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        r.setLength(2);
        r.setWidth(3);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
class Rectangle {
    private double length;
    private double width;
    public Rectangle() {

    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
}