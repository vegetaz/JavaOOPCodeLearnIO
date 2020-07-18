package J04Inheritance;

public class Inheritance39 {
    public static void main(String[] args) {
        System.out.println("Kết quả khi chạy chương trình:");
        System.out.println("class Student{\n" +
                "\tpublic String name;\n" +
                "\tpublic String address;\n" +
                "\t\n" +
                "\tpublic Student(String name, String address) {\n" +
                "\t\tthis.name = name;\n" +
                "\t\tthis.address = address;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "public class Entry {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tStudent s1 = new Student(\"Vận\", \"Nam Định\");\n" +
                "\t\tStudent s2 = new Student(\"Vận\", \"Nam Định\");\n" +
                "\t\tSystem.out.println(s1 == s2);\n" +
                "\t}\n" +
                "}");
        System.out.println("Sẽ là:");
        System.out.println("\tfalse");
        System.out.println("Bởi vì:");
        System.out.println("Toán tử == trong Java là toán tử so sánh địa chỉ nơi đối tượng được cấp phát chứ toán tử này không hề so sánh tới các thuộc tính của đối tượng.");
        System.out.println("Muốn so sánh thuộc tính đối tượng thì hãy sử dụng phương thức equals() mà lớp Object đã cung cấp sẵn.");
    }
}
