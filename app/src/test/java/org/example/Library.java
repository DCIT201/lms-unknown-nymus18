package org.example;
public class Library {
    private String libraryName;
    private String address;
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Getters and Setters
    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    // Methods to manage books
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

    // Methods to manage patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron.getName());
    }

    public void removePatron(Patron patron) {
        if (patrons.remove(patron)) {
            System.out.println("Patron removed: " + patron.getName());
        } else {
            System.out.println("Patron not found: " + patron.getName());
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public void listPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered in the library.");
        } else {
            System.out.println("Registered patrons:");
            for (Patron patron : patrons) {
                System.out.println("- " + patron.getName());
            }
        }
    }

    // Display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Address: " + address);
        System.out.println("Number of Books: " + books.size());
        System.out.println("Number of Patrons: " + patrons.size());
    }
}
