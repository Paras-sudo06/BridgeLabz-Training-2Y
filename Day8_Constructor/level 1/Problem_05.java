class Book {
    String title;
    String author;
    double price;
    boolean availability;

    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
        this.availability = true;
    }

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }

    public void borrow() {
        if(availability){
            System.out.println("You have borrowed \"" + title + "\" by " + author);
            availability = false;
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available right now");
        }
    }

    public void returnBook() {
        availability = true;
        System.out.println("You have returned \"" + title + "\" by " + author);
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println();
    }
}

public class Problem_05 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Java Basics", "Paras Shukla", 299.99, true);
        book2.displayInfo();

        book1.borrow();
        book1.borrow();
        book1.returnBook();
    }
}
