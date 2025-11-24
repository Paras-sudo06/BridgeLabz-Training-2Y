class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Fuel: " + fuelType + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", "Sport")
        };

        System.out.println("--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}