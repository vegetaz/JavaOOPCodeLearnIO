package J05PolymorphicAndAbstract;

public class Polymorphism43 {
    public static void main(String[] args) {
        SuperClass43 a = new SubClass43();
        System.out.println(a.x);
        a.display();
    }
}

class SuperClass43{
    int x = 10;
    public void display() {
        System.out.println(x);
    }
}

class SubClass43 extends SuperClass43{
    int x = 20;
    @Override
    public void display() {
        System.out.println(x);
    }
}
