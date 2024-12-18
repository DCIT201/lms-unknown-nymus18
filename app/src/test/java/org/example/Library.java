import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private String address;
    private List<String> books;
    private List<String> patrons;

    // Constructor
    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Overloaded Constructor
    public Library(String libraryName, String address, List<String> books, List<String> patrons) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>(books);
        this.patrons = new ArrayList<>(patrons);
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

    public List<String> getBooks() {
        return books;
    }

    public List<String> getPatrons() {
        return patrons;
    }

    // Methods to manage books
    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added to the library: " + book);
    }

    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book);
        } else {
            System.out.println("Book not found in the library: " + book);
            displayBooks();
        }
    }

    // Methods to manage patrons
    public void addPatron(String patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron);
    }

    public void removePatron(String patron) {
        if (patrons.remove(patron)) {
            System.out.println("Patron removed: " + patron);
        } else {
            System.out.println("Patron not found: " + patron);
            displayPatrons();
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
    }

    public void displayPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered in the library.");
        } else {
            System.out.println("Registered patrons:");
            for (String patron : patrons) {
                System.out.println("- " + patron);
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

    // Main Method (for testing purposes)
    public static void main(String[] args) {
        Library library = new Library("City Library", "123 Main Street");

        // Add books and patrons
        library.addBook("1984");
        library.addBook("To Kill a Mockingbird");
        library.addPatron("Alice");
        library.addPatron("Bob");

        // Display details
        library.displayLibraryDetails();
        library.displayBooks();
        library.displayPatrons();

        // Remove a book and a patron
        library.removeBook("1984");
        library.removePatron("Alice");

        // Display updated details
        library.displayBooks();
        library.displayPatrons();
    }
}
