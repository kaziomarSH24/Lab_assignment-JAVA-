class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Vehicle Speed: " + speed + " km/h");
    }

    // This Method to be overridden
    void fuelType() {
        System.out.println("Vehicle uses fuel.");
    }
}

// Subclass
class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    @Override
    void fuelType() {
        System.out.println("Car uses petrol or CNG.");
    }
}

// Subclass
class Truck extends Vehicle {
    Truck(int speed) {
        super(speed);
    }

    @Override
    void fuelType() {
        System.out.println("Truck uses diesel.");
    }
}

// Subclass
class Motorcycle extends Vehicle {
    Motorcycle(int speed) {
        super(speed);
    }

    @Override
    void fuelType() {
        System.out.println("Motorcycle uses petrol.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(120);
        Vehicle truck = new Truck(80);
        Vehicle motorcycle = new Motorcycle(100);

        car.showSpeed();
        car.fuelType();

        truck.showSpeed();
        truck.fuelType();

        motorcycle.showSpeed();
        motorcycle.fuelType();
    }
}
