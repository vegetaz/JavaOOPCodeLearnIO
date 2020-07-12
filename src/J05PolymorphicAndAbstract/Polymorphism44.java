package J05PolymorphicAndAbstract;
/*
Tính trừu tượng
    Tính trừu tượng là một tính chất mà chỉ tập trung vào những tính năng của đối tượng và ẩn đi những thông tin không cần thiết.
    Tính chất này giúp bạn trọng tâm hơn vào những tính năng thay vì phải quan tâm tới cách mà nó được thực hiện.
    Ví dụ về tính trừu tượng trong đời sống:
        Khi bạn đi rút tiền ở cây ATM thì bạn không cần quan tâm tới cách mà cây ATM hoạt động hay các thành phần có trong cây ATM,
        cái mà bạn quan tâm duy nhất đó là tính năng rút tiền.
        Trong trường hợp này các thông tin không cần thiết của cây ATM đã được ẩn đi, đó chính là tính trừu tượng.

    Tương tự trong lập trình cũng vậy,
    khi sử dụng một đối tượng bạn chỉ cần quan tâm tới các phương thức cần thiết
    và chỉ cần biết phương thức đó được dùng để làm gì chứ không cần quan tâm tới source code và các phương thức khác.
    Để thực hiện tính trừu tượng trong Java thì bạn có thể sử dụng lớp trừ tượng (abstract class) và interface.

Lớp trừu tượng (abstract class)
    Lớp trừu tượng là lớp được khai báo với từ khóa abstract và có một số đặc điểm sau:
        - Nếu một lớp được khai báo là lớp trừu tượng thì bạn không thể khởi tạo được đối tượng của lớp đó mà chỉ có thể khởi tạo được đối tượng của lớp con.
        - Lớp trừu tượng có thể có các phương thức trừu tượng.
          Phương thức trừu tượng là phương thức mà chỉ có phần khai báo, không có phần thân.
        - Nếu một lớp được kế thừa từ lớp trừu tượng thì lớp đó phải ghi đè tất cả các phương thức trừu tượng.
    Lớp trừu tượng thường được dùng để làm lớp cha cho các lớp có cùng bản chất.
    Việc sử dụng lớp trừu tượng và phương thức trừu tượng sẽ giúp bạn ẩn đi được cách cài đặt của phương thức.
    Tuy nhiên, bạn vẫn có thể khai báo các thuộc tính, các phương thức có phần thân nên việc sử dụng lớp trừu tượng sẽ không được coi là trừu tượng hoàn toàn.
    Để đạt được tính trừu tượng hoàn toàn bạn cần sử dụng tới interface.

interface
    interface được dùng để lưu trữ các phương thức trừu tượng và các biến hằng số.
    Một số đặc điểm của interface:
        - Giống với lớp trừu tượng, bạn không thể khởi tạo được đối tượng của interface mà chỉ có thể khởi tạo được đối tượng của lớp được kế thừa từ interface.
        - Tất cả các phương thức trong interface đều được trình biên dịch hiểu là các phương thức trừu tượng
          và tất cả các biến trong interface đều được trình biên dịch hiểu là các hằng số.
        - Một lớp có thể kế thừa nhiều interface.
          Như bạn đã biết, Java là ngôn ngữ được thiết kế với mục đích đơn giản nên không hỗ trợ đa kế thừa với class,
          nhưng do bản chất interface chỉ chứa các phương thức rỗng nên Java cho phép một lớp kế thừa nhiều interface.
    Khi nhìn vào interface thì thứ duy nhất mà bạn nhìn thấy đó là các phương thức trừu tượng (các tính năng),
    do đó sử dụng interface được coi là trừu tượng hoàn toàn.
    Trong thực tế, khi đi làm bạn sử dụng tới interface rất nhiều,
    với mỗi lớp bạn thường tạo ra 1 interface riêng để thể hiện các tính năng của lớp đó và giao tiếp với các đối tượng thông qua interface.
*/
public class Polymorphism44 {
    public static void main(String[] args) {
        Person person1 = new Employee("Trung", "HN", 3300);
        Person person2 = new Customer("Linh", "BN", 10400);
        person1.display();
        person2.display();
    }
}

abstract class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}

class Customer extends Person {
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer salary: " + balance);
    }
}
