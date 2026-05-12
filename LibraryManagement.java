import java.util.*;

// Custom Exception
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

// Book Class
class Book {

    private int bookId;
    private String bookName;
    private boolean isIssued;

    // Constructor
    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isIssued = false;
    }

    // Method to Issue Book
    public void issueBook() throws BookNotAvailableException {

        if (isIssued) {
            throw new BookNotAvailableException(
                    "Book is already issued!"
            );
        }

        isIssued = true;
        System.out.println(bookName + " issued successfully.");
    }

    // Method to Return Book
    public void returnBook() {

        if (!isIssued) {
            System.out.println(bookName + " was not issued.");
        } else {
            isIssued = false;
            System.out.println(bookName + " returned successfully.");
        }
    }

    // Display Book Information
    public void displayBook() {

        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Status : " +
                (isIssued ? "Issued" : "Available"));

        System.out.println("---------------------------");
    }
}

// Main Class
public class LibraryManagement {

    public static void main(String[] args) {

        // Creating Book Object
        Book b1 = new Book(101, "Java Programming");

        // Display Initial Details
        b1.displayBook();

        try {

            // Issue Book
            b1.issueBook();

            // Trying to Issue Again
            b1.issueBook();

        } catch (BookNotAvailableException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        // Return Book
        b1.returnBook();

        // Display Final Details
        b1.displayBook();
    }
}
