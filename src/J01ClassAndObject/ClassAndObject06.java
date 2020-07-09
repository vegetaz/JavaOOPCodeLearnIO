package J01ClassAndObject;
/*
Constructor (phương thức khởi tạo) trong Java được chia làm 2 loại là constructor không tham số và constructor có tham số.
Một constructor mà có tham số truyền vào được gọi là constructor có tham số.
Bạn cũng có thể gán giá trị cho các thuộc tính trong phương thức khởi tạo.
Lưu ý: nếu tên tham số đầu vào trùng với tên thuộc tính của lớp thì bạn có thể truy xuất tới thuộc tính của lớp bằng từ khóa this và toán tử ".".
*/
public class ClassAndObject06 {
    public static void main(String[] args) {
        Student6 s1 = new Student6("Long", 24);
        Student6 s2 = new Student6("Kien", 29);
        s1.display();
        s2.display();
    }
}

class Student6 {
    String name;
    int age;
    public Student6() {

    }
    public Student6(String n, int a) {
        name = n;
        age = a;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
