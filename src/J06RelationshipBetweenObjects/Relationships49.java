package J06RelationshipBetweenObjects;
/*
Lớp Author
    - Đây là lớp dùng để lưu thông tin về tác giả của các cuốn sách.
    - name, email là hai thuộc tính chỉ tên và địa chị email của tác giả.
    - Author(name: String, email: String) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
    - setName(), getName(), setEmail(), getEmail() là các setter và getter.

Lớp Book
    - Đây là lớp dùng để lưu thông tin về các cuốn sách.
    - name, price, authors lần lượt là các thuộc tính lưu trữ tên, giá bán, các tác giả của cuốn sách.
    - Book(name: String, authors: Author[], price: double)
      là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
    - setName(), getName(), setPrice(), getPrice() là các setter và getter.
    - getAuthorNames() là phương thức trả về tên của các tác giả đã viết cuốn sách dưới dạng "authorName1, authorName2, ..., authorNameN".
*/
public class Relationships49 {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Viet", "VietCV@codelearn.io");
        authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
        authors[2] = new Author("Kien", "KienNT@Codelearn.io");
        Book book1 = new Book("C++ for Beginners", 210000, authors);
        System.out.println(book1.getAuthorNames());
    }
}

class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Book {
    private String name;
    private double price;
    private Author[] authors;

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length - 1; i++) {
            authorNames += authors[i].getName() + ", ";
        }
        authorNames += authors[authors.length - 1].getName();
        return authorNames;
    }
}