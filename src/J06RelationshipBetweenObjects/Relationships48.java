package J06RelationshipBetweenObjects;
/*
Lớp Point
    - Đây là lớp dùng để lưu thông tin về một điểm trong hệ tọa độ hai chiều.
    - x và y là 2 thuộc tính chỉ tung độ và hoành độ của một điểm.
    - Point(x: int, y: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính x và y.
    - setX(), getX(), setY(), getY() là các setter và getter.

Lớp Triangle
    - Đây là lớp lưu thông tin về hình tam giác.
    - vertice1, vertice2, vertice3 là 3 thuộc tính chỉ 3 đỉnh của tam giác.
    - Triangle(vertice1: Point, vertice2: Point, vertice3: Point)
      là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho 3 đỉnh trong tam giác.
    - Triangle(x1: int, y1: int, x2: int, y2: int, x3: int, y3: int)
      là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho 3 đỉnh trong tam giác.
    - getPerimeter() là phương thức trả về chu vi của tam giác.
      Ví dụ nếu vertice1 = (1, 3), vertice2 = (2, 3), vertice3 = (4, 2) thì phương thức getPerimeter() sẽ trả về 8.48528137423857.
*/
public class Relationships48 {
    public static void main(String[] args) {
        Point48 vertice1 = new Point48(1, 3);
        Point48 vertice2 = new Point48(2, 3);
        Point48 vertice3 = new Point48(4, 2);
        Triangle48 triangle1 = new Triangle48(vertice1, vertice2, vertice3);
        Triangle48 triangle2 = new Triangle48(4, 5, 2, 6, 3, 7);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle2.getPerimeter());
    }
}

class Triangle48 {
    private Point48 vertice1;
    private Point48 vertice2;
    private Point48 vertice3;

    public Triangle48(Point48 vertice1, Point48 vertice2, Point48 vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triangle48(int x1, int y1, int x2, int y2, int x3, int y3) {
        vertice1 = new Point48(x1, y1);
        vertice2 = new Point48(x2, y2);
        vertice3 = new Point48(x3, y3);
    }

    public double getPerimeter() {
        double d1 = Math.sqrt(Math.pow(vertice1.getX() - vertice2.getX(), 2)
                + Math.pow(vertice1.getY() - vertice2.getY(), 2));
        double d2 = Math.sqrt(Math.pow(vertice1.getX() - vertice3.getX(), 2)
                + Math.pow(vertice1.getY() - vertice3.getY(), 2));
        double d3 = Math.sqrt(Math.pow(vertice2.getX() - vertice3.getX(), 2)
                + Math.pow(vertice2.getY() - vertice3.getY(), 2));
        return d1 + d2 + d3;
    }
}

class Point48 {
    private int x;
    private int y;

    public Point48(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
