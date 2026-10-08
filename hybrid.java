class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
interface Pet {
    void play();
}
class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog is playing");
    }
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal implements Pet {
    public void play() {
        System.out.println("Cat is playing");
    }
    void meow() {
        System.out.println("Cat is meowing");
    }
}
class Hybrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.play();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.play();
        c.meow();
        c.eat();
    }
}