interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 40 km/h");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar();
        v.displaySpeed();
        v.displayBattery();
    }
}
