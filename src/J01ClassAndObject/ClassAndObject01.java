package J01ClassAndObject;

import java.util.Scanner;

/*
Lập trình hướng đối tượng được hiểu đơn giản là một phương pháp để giải quyết bài toán lập trình mà khi áp dụng code sẽ trở nên dễ phát triển và dễ bảo trì hơn.
Đây là một phương pháp tiên tiến, phù hợp để phát triển hầu hết các ứng dụng hiện nay.
Phương pháp này sẽ giải quyết bài toán bằng cách chia chương trình thành các đối tượng, với mỗi đối tượng sẽ có các thuộc tính (dữ liệu) và hành vi riêng (phương thức).
*/
public class ClassAndObject01 {
    public static void main(String args[]) {
        System.out.println("Q: Bạn hãy cho biết lập trình hướng đối tượng là gì?");
        System.out.println("A: Một phương pháp tiên tiến, phù hợp để phát triển hầu hết các chương trình.");
    }
}
class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
//        System.out.println();
        name = sc.nextLine();
//        System.out.println();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
/*
- Lớp (class) là nơi định nghĩa thông tin về các đối tượng, bạn cũng có thể hiểu lớp là một kiểu dữ liệu mà biến của kiểu dữ liệu này được coi như một đối tượng.
Như trong ví dụ trên thì Student là lớp dùng để mô tả thông tin về các đối tượng học sinh.
Ví dụ về lớp: Học sinh, giáo viên, xe ô tô, …
- Đối tượng (object) là một thể hiện của lớp, bạn có thể hiểu đối tượng là một biến.
Như trong ví dụ trên thì biến student1 là một đối tượng đại diện cho thông tin của một học sinh.
- Thuộc tính (attribute): là các đặc điểm của đối tượng, như trong ví dụ trên thì name và age là hai thuộc tính của đối tượng học sinh.
Ví dụ về thuộc tính: tên, tuổi, chiều cao, cân nặng, năm sinh, ...
- Phương thức (method): là hành vi (hành động) của đối tượng, như ví dụ trên thì display() là một phương thức dùng để giới thiệu bản thân của học sinh.
Ví dụ về phương thức: giới thiệu bản thân, học bài, chạy, ...
*/