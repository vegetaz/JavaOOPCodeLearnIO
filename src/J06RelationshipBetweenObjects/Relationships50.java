package J06RelationshipBetweenObjects;
/*
Lớp Customer
    - Đây là lớp lưu thông tin về các khách hàng.
    - id, name và discount lần lượt là các thuộc tính chỉ mã khách hàng,
      tên khách hàng và phần trăm giảm giá của một hóa đơn đối với khách hàng.
    - Customer(id: int, name: String, discount: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
    - getId(), setName(), getName(), setDiscount(), getDiscount() là các setter và getter.
      Lớp này không có phương thức setId() vì trên thực tế mã là thuộc tính luôn không thay đổi.

Lớp Invoice
    - Đây là lớp lưu thông tin về các hóa đơn của khách hàng.
    - id, customer, amount lần lượt là thuộc tính chỉ mã hóa đơn, khách hàng và giá của hóa đơn.
    - Invoice(id: int, customer: Customer, amount: double)
      là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
    - getId(), setCustomer(), getCustomer(), setAmount(), getAmount() là các setter và getter.
      Lớp này cũng không có phương thức setId().
    - getCustomerName() là phương thức trả về tên của khách hàng.
    - getAmountAfterDiscount() là phương thức tính tiền hóa đơn sau khi đã áp dụng giảm giá đối với khách hàng.
      Ví dụ nếu hóa đơn có thuộc tính amount = 100000 và khách hàng sở hữu hóa đơn này có thuộc tính discount = 20 (20%)
      thì phương thức getAmountAfterDiscount() sẽ trả về 80000. Giải thích: 10000 - 10000 * 0.2 = 80000.
*/
public class Relationships50 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1000, "Tuan", 20);
        Invoice invoice1 = new Invoice(1000, customer1, 100000);
        System.out.println("Customer name: " + invoice1.getCustomerName());
        System.out.println("Invoice after discount: " + invoice1.getAmountAfterDiscount());
    }
}

class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}

class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }
}