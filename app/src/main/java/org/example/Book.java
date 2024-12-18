package org.example;
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    // Getters and setters
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }


    public void displayBookDetails(){
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The year the book was published is " + yearPublished);
    }
    
    
}
