package com.bridgelabz.oops.levelone;

class Hotelbooking {
    String guest_name;
    String room_type;
    int nights;

    // Default constructor
    public Hotelbooking() {
        this.guest_name = "Default";
        this.room_type = "3rd AC";
        this.nights = 3;
    }

    // Parameterized constructor
    public Hotelbooking(String guest_name, String room_type, int nights) {
        this.guest_name = guest_name;
        this.room_type = room_type;
        this.nights = nights;
    }

    // Copy constructor
    public Hotelbooking(Hotelbooking Copy) {
        this.guest_name = Copy.guest_name;
        this.room_type = Copy.room_type;
        this.nights = Copy.nights;
    }

    void displayInfo() {
        System.out.println("Guest name: " + guest_name);
        System.out.println("Room type: " + room_type);
        System.out.println("Duration: " + nights + " Nights");
        System.out.println("----------------------");
    }
}

public class Problem_04 {
    public static void main(String[] args) {
        Hotelbooking h1 = new Hotelbooking();
        Hotelbooking h2 = new Hotelbooking("Paras", "2nd AC", 5); // parameterized
        Hotelbooking h3 = new Hotelbooking(h2);

        h1.displayInfo();
        h2.displayInfo();
        h3.displayInfo();
    }
}
