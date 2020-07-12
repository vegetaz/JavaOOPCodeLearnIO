package J05PolymorphicAndAbstract;

public class Polymorphism41 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Duck();
        for (int i = 0; i < 4; i++) {
            animals[i].sound();
        }
    }
}
class Animal {
    public void sound() {
        System.out.println("some sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("bow wow");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow meow");
    }
}

class Duck extends Animal {
    public void sound() {
        System.out.println("quack quack");
    }
}
