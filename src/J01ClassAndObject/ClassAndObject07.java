package J01ClassAndObject;

public class ClassAndObject07 {
    public static void main(String[] args) {
        System.out.println("Nếu một lớp đã được khai báo constructor thì chương trình sẽ không tự sinh ra constructor mặc định nữa" +
                "\n(constructor mặc định là constructor không tham số).");
        System.out.println("Có thể thấy lớp Customer đã được khai báo constructor và đây lại là constructor có tham số nên trong phương thức main() " +
                "\nbạn không thể khởi tạo được đối tượng thuộc lớp customer (do trong phương thức main() bạn gọi tới constructor không tham số " +
                "\nnhưng trong lớp Customer lại không có constructor này). ");
    }
}
