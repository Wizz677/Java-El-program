interface Vehicle {
    void start();
    void stop();
}

abstract class VehicleBase {
    abstract void drive();
}

class Car extends VehicleBase implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

class MotorBike extends VehicleBase implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    void drive() {
        System.out.println("Bike is driving");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.stop();
        car.drive();

        MotorBike bike = new MotorBike();
        bike.start();
        bike.stop();
        bike.drive();
    }
}
