package J01ClassAndObject;
/* Bạn hãy viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật và hiển thị ra màn hình */
import java.util.Scanner;

class Rectangle{
    double length;
    double width;
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        sc.nextLine();
        width = sc.nextDouble();
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class ClassAndObject03 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}
