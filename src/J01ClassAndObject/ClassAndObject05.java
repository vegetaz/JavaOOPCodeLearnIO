package J01ClassAndObject;

public class ClassAndObject05 {
    public static void main(String[] args) {
        System.out.println("Constructor (phương thức khởi tạo)");
        System.out.println("Trong Java, constructor là một phương thức đặc biệt, phương thức này sẽ tự động được gọi khi bạn khởi tạo một đối tượng (với các phương thức thông thường thì bạn cần dùng toán tử \".\" để gọi tới).");
        System.out.println("Constructor có đặc điểm là không được định nghĩa kiểu trả về và có tên trùng với tên lớp.");
        System.out.println("Nếu một lớp không được khai báo constructor thì chương trình sẽ tự động tạo ra một constructor mặc định. ");
        System.out.println("Lưu ý: Nếu bạn dùng từ khóa private để khai báo constructor thì bạn sẽ không thể khởi tạo được đối tượng của lớp này.");
    }
}
