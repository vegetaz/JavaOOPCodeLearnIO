package J02StaticVariablesAndStaticMethods;

public class Static16 {
    public static void main(String[] args) {
        System.out.println("Kết quả của chương trình:");
        System.out.println("class Math{\n" +
                "\tpublic static int max(int a, int b) {\n" +
                "\t\treturn a > b ? a : b;\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic static int max(int a, int b, int c) {\n" +
                "\t\treturn max(max(a, b), c);\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "class Entry {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tSystem.out.println(Math.max(3, 5, 2));\n" +
                "\t}\n" +
                "}");
        System.out.println("Sẽ là:");
        System.out.println("\t5");
        System.out.println("Bởi vì:");
        System.out.println("\tTrong lớp Math có nhiều phương thức max nhưng khác nhau về kiểu dữ liệu và tham số, đó là nạp chồng phương thức.");
        System.out.println("\nNạp chồng phương thức");
        System.out.println("\tNếu một lớp có nhiều phương thức cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số các tham số, thì đó là nạp chồng phương thức.");
        System.out.println("Lợi ích của nạp chồng phương thức");
        System.out.println("\tNạp chồng phương thức giúp bạn tránh được việc tạo ra các phương thức với tên gọi khác nhau, giúp cho code trở nên gọn gàng, dễ đọc hơn.");
    }
}
