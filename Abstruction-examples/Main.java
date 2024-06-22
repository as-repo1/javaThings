// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Provide implementation for the abstract method
    void makeSound() {
        System.out.println("The dog says: bark bark");
    }
}

// Subclass (inherits from Animal)
class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat says: meow meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call the makeSound method on Dog and Cat objects
        dog.makeSound();
        cat.makeSound();

        // Call the sleep method on Dog and Cat objects
        dog.sleep();
        cat.sleep();
    }
}