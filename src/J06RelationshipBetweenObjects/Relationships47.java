package J06RelationshipBetweenObjects;
/*
Mối quan hệ giữa các đối tượng

Quan hệ phụ thuộc
    - Quan hệ phụ thuộc là quan hệ mà đối tượng của lớp này sử dụng đối tượng của lớp kia.
      Ví dụ nếu trong lớp ClassA có sử dụng đối tượng của lớp ClassB (có thể là các thuộc tính, các tham số, các biến cục bộ, ...)
      thì lớp ClassA có quan hệ phụ thuộc với lớp ClassB.
      Ví dụ:
        class ClassA{
            public void myMethod(ClassB b) {
                b.doWork();
            }
        }
    - Trong trường hợp trên lớp ClassA sẽ phụ thuộc vào lớp ClassB, nếu lớp ClassB thay đổi thì có thể lớp ClassA sẽ phải thay đổi theo.
    - Đây là quan hệ rộng nhất và được biểu diễn bằng mũi tên nét đứt
        Class A ---nét đứt---> Class B

Quan hệ kết hợp (Association)
    - Quan hệ kết hợp xảy ra khi một đối tượng có thuộc tính là một đối tượng khác.
    - Ví dụ:
        class Employee {
            private String name;
            private Manager manager;
            public Employee(String name, Manager manager) {
                this.name = name;
                this.manager = manager;
            }
            public String getManagerName() {
                return manager.getName();
            }
            public String getName() {
                return name;
            }
        }
        class Manager {
            private String name;
            public Manager(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
    - Trong đoạn code trên lớp Employee có thuộc tính là đối tượng thuộc lớp Manager, do đó hai lớp này có quan hệ kết hợp.
      Quan hệ kết hợp được chia làm 2 loại là quan hệ thu nạp (Aggregation) và quan hệ hợp thành (Composition)

Quan hệ thu nạp (Aggregation)
    - Quan hệ thu nạp xảy ra khi một đối tượng có thuộc tính là một đối tượng khác và 2 đối tượng này có thể tồn tại độc lập.
    - Ví dụ:
        public class ClassA {
            ClassB b;
            public void setB(ClassB b){
                this.b = b;
             }
        }
    - Có thể thấy đối tượng của ClassB tồn tại độc lập với đối tượng của ClassA (ClassA không tạo ra đối tượng của ClassB).
    - Class A <>-----nét liền----- Class B

Quan hệ hợp thành (Composition)
    - Quan hệ hợp thành xảy ra khi đối tượng của lớp ClassB là 1 phần trong đối tượng của lớp ClassA,
      khi đối tượng của lớp ClassA bị hủy thì đối tượng của ClassB cũng bị hủy theo.
      Ví dụ mối quan hệ giữa File và Folder, một Folder sẽ có nhiều File và nếu Folder bị hủy thì File cũng bị hủy theo.
      Quan hệ hợp thành này sẽ được biểu diễn dưới sơ đồ lớp như sau:
        Folder <(tô màu đen)>-----nét liền----- File
                            1                  *
    - Số 1 và ký tự * thể hiện rằng 1 Folder sẽ có nhiều File.
      Nếu nói tới code thì khi một đối tượng được tạo ra trong một đối tượng khác thì đó là quan hệ hợp thành:
        public class ClassA{
            private ClassB b;
            public ClassA() {
                b = new ClassB();
            }
        }
*/
public class Relationships47 {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());
    }
}
/*
Lớp Point
    - Đây là lớp dùng để lưu thông tin về một điểm trong hệ tọa độ hai chiều.
    - x và y là 2 thuộc tính chỉ hoành độ và tung độ của một điểm.
    - Point(x: int, y: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính x và y.
    - setX(), getX(), setY(), getY() là các setter và getter.
Lớp Line
    - Đây là lớp dùng để lưu thông tin về một đoạn thẳng trong hệ tọa độ hai chiều.
    - begin và end là hai thuộc tính chỉ điểm bắt đầu và điểm kết thúc của đoạn thẳng,
      hai thuộc tính này là đối tượng của lớp Point.
    - Line(begin: Point, end: Point) và Line(x1: int, y1: int, x2: int, y2: int) là phương thức khởi tạo
      dùng để khởi tạo giá trị cho các thuộc tính.
    - setBegin(), getBegin(), setEnd(), getEnd() là các setter và getter.
    - getLength() là phương thức trả về độ dài đoạn thẳng.
      Ví dụ nếu thuộc tính begin = (1, 1), end = (2, 2) thì phương thức getLength() sẽ trả về 1.4142135623730951.
*/
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }
}