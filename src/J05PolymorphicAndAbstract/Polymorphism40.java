package J05PolymorphicAndAbstract;
/*
Tính đa hình (Polymorphism)
    Polymorphism là từ được cấu thành từ 2 từ Hy Lạp là poly và morhps,
    nếu hiểu theo nghĩa tiếng anh thì từ này có nghĩa là one thing in many form.
    Tính đa hình được thể hiện trong code dưới 3 hình thức:
        - nạp chồng phương thức,
        - ghi đè phương thức
        - và đa hình thông qua các đối tượng đa hình (polymorphic objects).

Đa hình với nạp chồng phương thức
    Ví dụ phương thức cộng sẽ có các "forms" là cộng 2 số nguyên, cộng 2 số thực, cộng 3 số nguyên, v/v.
    Có thể thấy cùng là phương thức cộng nhưng lại có nhiều "forms" (one thing in many form) nên đây chính là biểu hiện của tính đa hình.

Đa hình với ghi đè phương thức
    Ví dụ phương thức getSalary() dùng để tính lương sẽ có các "forms" là tính lương cho quản lý, tính lương cho nhân viên

Đa hình thông qua các đối tượng đa hình (polymorphic objects)
    Như đã học ở bài up-casting, biến thuộc lớp cha có thể tham chiếu tới đối tượng của các lớp con,
    vậy biến thuộc lớp cha cũng có nhiều "forms" nên đây cũng là đa hình.
*/
public class Polymorphism40 {
    public static void main(String[] args) {
        System.out.println("Q:");
        System.out.println("\tNạp chồng phương thức có thể hiện tính đa hình không?");
        System.out.println("A:");
        System.out.println("\tCó");
    }
}
