import java.util.Scanner;

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("City: " + address.getCity());
        System.out.println("Country: " + address.getCountry());
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.print("Enter country: ");
        String country = input.nextLine();

        Address addr = new Address(city, country);
        Person person = new Person(name, addr);

        System.out.println("\n--- Person Details ---");
        person.displayDetails();

        input.close();
    }
}