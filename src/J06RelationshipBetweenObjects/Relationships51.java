package J06RelationshipBetweenObjects;

import java.util.ArrayList;
import java.util.List;
/*
Lớp Point
    - Đây lớp dùng để lưu thông tin về một điểm trong hệ tọa độ hai chiều.
    - x và y là 2 thuộc tính chỉ tung độ và hoành độ của một điểm.
    - Point(x: int, y: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính x và y.
    - setX(), getX(), setY(), getY() là các setter và getter.

Lớp PolyLine
    - points là thuộc tính lưu thông tin về các điểm trong PolyLine, thuộc tính này có kiểu dữ liệu là List.
      Nếu bạn chưa học về List thì có thể tham khảo thêm tại khóa học Java cơ bản.
    - PolyLine() là phương thức khởi tạo không tham số dùng để khởi tạo một ArrayList rỗng cho thuộc tính points.
    - PolyLine(points: List<Point) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính ponits.
    - appendPoint(point: Point) và appendPoint(x: int, y: int) là phương thức dùng để thêm một điểm vào cuối thuộc tính points.
    - getLength() là phương thức dùng để lấy ra độ dài của PolyLine.
      Ví dụ nếu đối tượng PolyLine có thuộc tính points = [(1, 1), (2, 3), (3, 0), (4, 2)]
*/
public class Relationships51 {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(new Point51(1, 1));
        polyLine.appendPoint(new Point51(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}

class Point51 {
    private int x;
    private int y;

    public Point51(int x, int y) {
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

class PolyLine {
    private List<Point51> points;

    public PolyLine() {
        points = new ArrayList<Point51>();
    }

    public PolyLine(List<Point51> points) {
        this.points = points;
    }

    public void appendPoint(Point51 point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point51(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}