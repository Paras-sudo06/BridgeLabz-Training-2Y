package com.bridgelabz.oops.levelone;

class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Introduction";
        this.author = "Jay Prakash";
        this.price = 199;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

public class Problem_01 {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Java Basics", "Paras Shukla", 299.99);
        book2.displayInfo();
    }
}
