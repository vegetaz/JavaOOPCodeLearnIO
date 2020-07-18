package J05PolymorphicAndAbstract;
/*
Variable Hiding
    Variable Hiding xảy ra khi lớp con khai báo thuộc tính có tên giống tên thuộc tính ở lớp cha,
    lúc này thuộc tính của lớp cha sẽ không bị lớp con ghi đè mà bị lớp con ẩn đi
*/
public class Polymorphism42 {
    public static void main(String[] args) {
        SuperClass a = new SubClass();
        System.out.println(a.x);
        System.out.println(((SubClass)a).x);
    }
}
class SuperClass{
    int x = 10;
}

class SubClass extends SuperClass{
    int x = 20;
}
