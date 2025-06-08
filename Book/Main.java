package Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book b1 = new Book(10, "tamil", "saran");
        Book b2 = new Book(11, "english", "ram");
        Book b3 = new Book(12, "social", "jaya");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayAllBooks();

        // Search for a book
        library.searchBook(10);  

        // Remove a book
        library.removeBook(11);  

        // Display all books again
        library.displayAllBooks();
    }
}
