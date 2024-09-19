
class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ISBN = "Unknown";
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.ISBN = "Unknown";
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book("Amr Bangla", "Omar", "112-9669669");
        Book book2 = new Book("English Grammar", "Tahsan");
        Book book3 = new Book("Java Program");

        book1.show();
        book2.show();
        book3.show();
    }
}
