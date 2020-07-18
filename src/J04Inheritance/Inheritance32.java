package J04Inheritance;
/*
Lớp con không được thừa hưởng các thuộc tính và phương thức private từ lớp cha.
 - Trong kế thừa, các lớp con chỉ có thể thừa hưởng được các thuộc tính và phương thức có phạm vi truy cập public,
   protected và default (trong trường hợp lớp con và lớp cha cùng package).

Constructor của lớp con luôn gọi tới constructor của lớp cha
 - Constructor của lớp con luôn gọi tới constructor luôn gọi tới constructor của lớp cha,
   nếu bạn không chỉ rõ là cần gọi tới constructor nào của lớp cha thì lớp con sẽ luôn gọi tới constructor mặc định của lớp cha.
 - Có thể thấy constructor mặc định (constructor không tham số) của lớp cha đã được gọi cùng với constructor của lớp con.
   Do đó, khi lớp cha không có constructor mặc định mà lớp con không chỉ rõ cần gọi tới constructor nào của lớp cha thì chương trình sẽ báo lỗi.
 - Lúc này bạn phải dùng từ khóa super để chỉ cho lớp con biết cần phải gọi tới constructor nào của lớp cha.
*/
public class Inheritance32 {
    public static void main(String[] args) {
        Student32 s = new Student32("Hai", 1999, 8.8);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGpa());
    }
}

class Person32 {
    private String name;
    private int dob;
    public Person32(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
}

class Student32 extends Person32 {
    private double gpa;

    public Student32(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
