package org.example;
public class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Getters and Setters
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 10.99);
        book.displayBookDetails();

        // Using setters to modify attributes
        book.setPrice(12.99);
        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();
    }
}
