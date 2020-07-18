package J03Encapsulation;
/*
Up-casting và Down-casting

Up-casting
Khi biến của lớp cha tham chiếu tới đối tượng của lớp con (đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha), thì đó được gọi là up-casting.
Khi biến của lớp cha tham chiếu tới đối tượng của lớp con thì biến này chỉ có thể gọi tới các thuộc tính và phương thức có ở lớp cha và nếu lớp con ghi đè thì phương thức được gọi sẽ ở lớp con.

Down-casting
Bạn hãy hiểu đơn giản rằng down-casting ngược với up-casting, up-casting là chuyển từ lớp con sang lớp cha thì down-casting là chuyển từ lớp cha sang lớp con.
*/
public class Encapsulation29 {
    public static void main(String[] args) {
        Employee29 e = new Manager();
        // Up-casting
        e.display();
        // Down-casting
        ((Manager) e).play();
    }
}

class Employee29 {
    public void display() {
        System.out.println("I'm an employee");
    }
}

class Manager extends Employee29 {
    @Override
    public void display() {
        System.out.println("I'm a manager");
    }
    public void play() {
        System.out.println("Ma ná dờ");
    }
}
