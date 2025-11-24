
import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }
}

public class Animalheirarchy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal[] animals = {
                new Dog("Dog_1", 3),
                new Cat("Cat_1", 2),
                new Bird("Bird_1", 1)
        };

        System.out.println("Animal Sounds");
        for (Animal a : animals) a.makeSound();
        input.close();
    }
}