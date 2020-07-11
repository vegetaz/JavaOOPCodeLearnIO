package J02StaticVariablesAndStaticMethods;

public class Static13 {
    public static void main(String[] args) {
        System.out.println("Kết quả của chương trình dưới đây:");
        System.out.println("class Entry {\n" +
                "\tint x = 10;\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tSystem.out.println(x);\n" +
                "\t}\n" +
                "}");
        System.out.println("Sẽ là \"Lỗi biên dịch\"");
        System.out.println("Bởi vì:");
        System.out.println("Phương thức static sẽ chỉ có thể truy xuất được tới biến static, " +
                "do đó kết quả sẽ là Lỗi biên dịch (do phương thức main là phương thức static " +
                "mà biến x không phải là biến static nên không thể gọi tới biến x từ phương thức main).");
    }
}
