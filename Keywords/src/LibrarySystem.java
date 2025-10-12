// Book class
class Book {
    private static String libraryName = "City Central Library";

    private final String isbn;

    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }

    // Getter and Setter methods
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


public class LibrarySystem {
    public static void main(String[] args) {

        Book.displayLibraryName();

        Book book1 = new Book("ISBN101", "Java Programming", "Paras Shukla");
        Book book2 = new Book("ISBN102", "Data Structures", "Amit Kumar");

        book1.displayDetails();
        book2.displayDetails();
    }
}
