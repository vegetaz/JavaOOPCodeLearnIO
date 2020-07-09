package J01ClassAndObject;

public class ClassAndObject08 {
    public static void main(String[] args) {
        System.out.println("Sơ đồ lớp\n" +
                "\n" +
                "Như bạn đã biết, lập trình hướng đối tượng là phương pháp giải quyết các bài toán lập trình thông qua các đối tượng và mối quan hệ giữa chúng,\n" +
                "một chương trình thực tế sẽ có rất nhiều các lớp và đối tượng. Sơ đồ lớp chính là sơ đồ mà nhìn vào đó bạn thấy được mô tả của các lớp,\n" +
                "mối quan hệ giữa các đối tượng trong hệ thống (mối quan hệ giữa các đối tượng bạn sẽ được học trong các bài tiếp theo).\n" +
                "\n" +
                "Một ký hiệu lớp sẽ có 3 phần là Class name (tên lớp), attributes (danh sách các thuộc tính)\n" +
                "và operations (các thủ tục, để đơn giản thì bạn hãy coi thủ tục chính là phương thức).\n" +
                "\n" +
                "Trong sơ đồ lớp, bạn có thể mô tả phạm vi truy cập của các thuộc tính, phương thức bằng cách đặt các ký tự -, ~, #, + trước các thuộc tính và phương thức.\n" +
                "\n" +
                "Ký tự '-' sẽ tương ứng với phạm vi truy cập private.\n" +
                "Ký tự '~' sẽ tương ứng với phạm vi truy cập default.\n" +
                "Ký tự '#' sẽ tương ứng với phạm vi truy cập protected.\n" +
                "Ký tự '+' sẽ tương ứng với phạm vi truy cập public.\n" +
                "\n" +
                "Lưu ý: khi một phương thức không được định nghĩa kiểu trả về và tên phương thức trùng với tên lớp thì đây chính là phương thức khởi tạo.\n");
    }
}
