package com.bridgelabz.oops.levelone;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    public CarRental() {
        this("Unknown", "Not Selected", 0, 1000);
    }

    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        System.out.println();

        CarRental rental2 = new CarRental("Paras Shukla", "Honda City", 5, 1500);
        rental2.displayRentalDetails();
    }
}
