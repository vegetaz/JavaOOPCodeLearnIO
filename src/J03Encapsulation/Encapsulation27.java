package J03Encapsulation;
/*
- Point là lớp lưu thông tin về tọa độ một điểm trong hệ tọa độ 2 chiều.
- x, y là các thuộc tính chỉ hoành độ, tung độ của đối tượng lớp Point.
- Point() là phương thức khởi tạo không tham số
- Point(x: double, y: double) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính x (hoành độ) và y (tung độ).
- setX(x: double), getX(), setY(y: double), getY() là các setter và getter mà bạn đã biết.
- setXY(x: double, y:double) là phương thức dùng để thay đổi giá trị cho thuộc tính x và y.
- distance(x: double, y:double) là phương thức trả về khoảng cách giữa đối tượng hiện tại và điểm có hoành độ x, tung độ y.
- distance(another: Point) là phương thức trả về khoảng cách giữa đối tượng hiện tại và đối tượng another (another cũng là một đối tượng thuộc lớp Point).
*/
public class Encapsulation27 {
    public static void main(String[] args) {
        Point p1 = new Point(1.5, 6.7);
        Point p2 = new Point(2.8, 3.2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.34, 7.8));
    }
}
class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}
