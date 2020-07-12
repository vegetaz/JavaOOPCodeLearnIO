package J04Inheritance;
/*
Việc sử dụng @Override annotation là không bắt buộc nhưng trong mọi trường hợp bạn nên dùng nó vì các lợi ích sau:
 - Nếu một phương thức được chú thích với annotation @Override thì chương trình sẽ kiểm tra xem phương thức này
   có thực sự ghi đè phương thức của lớp cha không, nếu không thì sẽ báo lỗi.
   Việc này sẽ giúp bạn ngăn được những lỗi đánh máy như gõ nhầm tên phương thức hoặc nhầm tham số.
   Nếu không có @Override annotation thì bạn sẽ không thể biết được bạn có thực sự đang ghi đè phương thức từ lớp cha hay không.
 - Giúp người khác khi nhìn vào code sẽ hiểu được đây là phương thức được ghi đè từ lớp cha.

Lưu ý: Trong trường hợp phương thức của lớp cha bị ghi đè thì bạn vẫn có thể gọi tới nó bằng từ khóa super.

Ngoài ra, phương thức static sẽ không thể bị ghi đè và đối với các phương thức non-static
bạn có thể ngăn không cho lớp con ghi đè bằng cách thêm từ khóa final.
*/
public class Inheritance33 {
    public static void main(String[] args) {
        Student33 s = new Student33("Vận", "Male", 17000000);
        s.display();
    }
}
class Person33 {
    private String name;
    private String gender;

    public Person33(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student33 extends Person33 {
	private int salary;

    public Student33(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        // Ghi đè phương thức của lớp cha với từ khoá super
        super.display();
        System.out.println("Salary: " + salary);
    }
}
