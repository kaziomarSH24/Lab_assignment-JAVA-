/*Implement a superclass Animal with methods eat and sleep. Create subclasses such as Dog,
Cat, and Bird that inherit from Animal and override these methods.*/

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating bones.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping in its kennel.");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating fish.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping on the sofa.");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("The bird is eating seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("The bird is sleeping in its nest.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        bird.eat();
        bird.sleep();
    }
}
