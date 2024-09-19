class Animal {
    public void eat() {
        System.out.println("This animal is eating.");
    }

    public void makeSound() {
        System.out.println("This animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating bones.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating fish.");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat says: Meow Meow!");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("The bird is eating seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println("The bird says: Chirp Chirp!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();

        Animal bird = new Bird();
        bird.eat();
        bird.makeSound();
    }
}
