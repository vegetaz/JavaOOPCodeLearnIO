package J02StaticVariablesAndStaticMethods;
/*
            Student
-name: String
-gender: char
+Student()
+Student(name: String)
+Student(gender: char)
+Student(name: String, gender: char)
+display(): void
*/
public class Static19 {
    public static void main(String[] args) {
        Student19 s1 = new Student19();
        s1.display19();
        Student19 s2 = new Student19("Quang");
        s2.display19();
        Student19 s3 = new Student19('m');
        s3.display19();
        Student19 s4 = new Student19("Thu", 'f');
        s4.display19();
    }
}

class Student19 {
    private String name;
    private char gender;
    public Student19() {
        name = "Unknown";
        gender = 'u';
    }
    public Student19(String name) {
        this.name = name;
        this.gender = 'u';
    }
    public Student19(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }
    public Student19(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    public void display19() {
        System.out.println("Name: " + name);
        if (gender == 'u') {
            System.out.println("Gender: Unknown");
        }
        if (gender == 'm') {
            System.out.println("Gender: Male");
        }
        if (gender == 'f') {
            System.out.println("Gender: Female");
        }
    }
}
