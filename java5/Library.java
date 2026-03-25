package java5;

public class Library {

    Book[] books = {
        new Book("Java Programming"),
        new Book("Data Structures"),
        new Book("Operating Systems"),
        new Book("Object Oriented Programming"),
        new Book("Web Technology"),
        new Book("Let us C"),
        new Book("Python"),
        new Book("Database Management Systems"),
        new Book("Computer Networks"),
        new Book("Software Engineering"),
        new Book("Artificial Intelligence"),
        new Book("Machine Learning")
    };

    public void issueBook(String title)
            throws BookNotFoundException, BookAlreadyIssuedException {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isIssued) {
                    throw new BookAlreadyIssuedException(
                        "The book is already checked out!"
                    );
                }
                book.isIssued = true;
                System.out.println("Book checked out successfully: " + book.title);
                return;
            }
        }
        throw new BookNotFoundException(
            "Book '" + title + "' not found in the library"
        );
    }

    public void returnBook(String title, int daysLate)
            throws BookNotFoundException, InvalidReturnException {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.isIssued) {
                    throw new InvalidReturnException("The book was not checked out.");
                }
                if (daysLate < 0) {
                    throw new InvalidReturnException(
                        "Invalid return date! Days late cannot be negative."
                    );
                }
                book.isIssued = false;
                System.out.println("Book returned successfully: " + book.title);
                if (daysLate > 3) {
                    int lateFee = daysLate * 6;
                    System.out.println("Late Fees: " + lateFee);
                }
                return;
            }
        }
        throw new BookNotFoundException(
            "Book '" + title + "' not found in the library"
        );
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book.title + " - " +
                (book.isIssued ? "Checked Out" : "Available"));
        }
    }
}