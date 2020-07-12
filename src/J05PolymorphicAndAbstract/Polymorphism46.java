package J05PolymorphicAndAbstract;

public class Polymorphism46 {
    public static void main(String[] args) {
        IEmployee46 employee1 = new PartTimeEmployee46("Trung", 45000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee46 employee2 = new FullTimeEmployee46("Linh", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}

interface IEmployee46 {
    int calculateSalary();
    String getName();
}

abstract class Employee46 implements IEmployee46 {
    private String name;
    private int paymentPerHour;

    public Employee46(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}

class PartTimeEmployee46 extends Employee46 {
    private int workingHours;

    public PartTimeEmployee46(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}

class FullTimeEmployee46 extends Employee46 {
    public FullTimeEmployee46(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}