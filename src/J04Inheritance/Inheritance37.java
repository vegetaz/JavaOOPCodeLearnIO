package J04Inheritance;
/* toString()
toString() là phương thức ghi đè từ lớp Object, phương thức này sẽ trả về thông tin của đối tượng dưới dạng String.
*/
public class Inheritance37 {
    public static void main(String[] args) {
        Student37 s37 = new Student37("Vận", "Nam Định", 9.7);
        System.out.println(s37.toString());
    }
}
class Student37 {
    private String name;
    private String address;
    private double gpa;
    public Student37(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + "," + "\n"
                + "Address: " + address + "," + "\n"
                + "GPA: " + gpa;
    }
}
