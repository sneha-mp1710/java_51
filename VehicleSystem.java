interface FuelEfficient {
    double calculateMileage();
}

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle implements FuelEfficient {
    int distance;    
    int fuelUsed;     

    Car(String brand, int speed, int distance, int fuelUsed) {
        super(brand, speed);
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    @Override
    void start() {
        System.out.println("Car Started...");
    }

    @Override
    public double calculateMileage() {
        return (double) distance / fuelUsed;
    }
}

class Bike extends Vehicle implements FuelEfficient {
    int distance;  
    int fuelUsed;    

    Bike(String brand, int speed, int distance, int fuelUsed) {
        super(brand, speed);
        this.distance = distance;
        this.fuelUsed = fuelUsed;
    }

    @Override
    void start() {
        System.out.println("Bike Started...");
    }

    @Override
    public double calculateMileage() {
        return (double) distance / fuelUsed;
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Honda", 80, 180, 10);
        car.displayInfo();
        car.start();
        System.out.println("Mileage: " + (int)car.calculateMileage() + " km/l");

        System.out.println();

        Bike bike = new Bike("Yamaha", 60, 120, 4);
        bike.displayInfo();
        bike.start();
        System.out.println("Mileage: " + (int)bike.calculateMileage() + " km/l");
    }
}
