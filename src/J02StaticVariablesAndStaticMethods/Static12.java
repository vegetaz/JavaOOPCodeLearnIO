package J02StaticVariablesAndStaticMethods;

public class Static12 {
    public static void main(String[] args) {
        System.out.println("Một số tính chất của phương thức static:");
        System.out.println("\t- Phương thức static có để được gọi mà không cần phải khởi tạo đối tượng.");
        System.out.println("\t- Trong cùng một lớp, phương thức static chỉ có thể gọi tới phương thức static khác, không thể gọi tới phương thức không phải là static.");
        System.out.println("\t- Trong cùng một lớp, phương thức static không thể gọi tới các thuộc tính không phải là static.");
        System.out.println("\nKết quả của chương trình:\n" +
                "class Student {\n" +
                "\tprivate String name;\n" +
                "\tprivate int age;\n" +
                "\n" +
                "\tpublic static int numberOfStudents;\n" +
                "\n" +
                "\tpublic Student(String name, int age) {\n" +
                "\t\tthis.name = name;\n" +
                "\t\tthis.age = age;\n" +
                "\t\tnumberOfStudents++;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "class Entry {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tStudent s1 = new Student(\"Manh\", 19);\n" +
                "\t\tStudent s2 = new Student(\"Trung\", 19);\n" +
                "\t\tStudent s3 = new Student(\"Kien\", 19);\n" +
                "\t\tSystem.out.println(Student.numberOfStudents);\n" +
                "\t}\n" +
                "}" +
                "\n" +
                "\n" +
                "Sẽ là 3");
    }
}
