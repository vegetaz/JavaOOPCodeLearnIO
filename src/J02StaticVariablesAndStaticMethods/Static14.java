package J02StaticVariablesAndStaticMethods;

public class Static14 {
    public static void main(String[] args) {
        System.out.println("Kết quả của chương trình");
        System.out.println("class MyClass{\n" +
                "\tpublic static int x = 10;\n" +
                "}\n" +
                "\n" +
                "class Entry {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tMyClass m1 = new MyClass();\n" +
                "\t\tMyClass m2 = new MyClass();\n" +
                "\t\tm1.x = 20;\n" +
                "\t\tSystem.out.print(m1.x + \" \" + m2.x);\n" +
                "\t}\n" +
                "}");
        System.out.println("Sẽ là:");
        System.out.println("\t20 20");
        System.out.println("Bởi vì:");
        System.out.println("\tBiến static là biến mà được dùng chung cho tất cả các đối tượng, nên khi gán giá trị 20 cho x ở đối tượng m1 thì giá trị x của đối tượng m2 cũng là x của đối tượng m1");
    }
}
