package J03Encapsulation;
/*
Bạn hãy viết chương trình hiển thị ra màn hình thông tin sau:
Id: 1001
Name: Quynh
Age: 24
Address: Ha Noi
*/
public class Encapsulation21 {
    public static void main(String args[]) {
        Person p = new Person();
        p.setId(1001);
        p.setName("Quynh");
        p.setAge(24);
        p.setAddress("Ha Noi");
        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
    }
}

class Person {
    private int id;
    private String name;
    private int age;
    private String address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
/*
Trong thực tế bạn nên sử dụng phương thức khởi tạo có tham số để khởi tạo giá trị cho các thuộc tính và sử dụng các setter để thay đổi giá trị cho các thuộc tính (ưu tiên phương thức khởi tạo có tham số trước).
*/