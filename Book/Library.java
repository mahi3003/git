package Book;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void removeBook(int bookID) {
        for (Book b : books) {
            if (b.bookID == bookID) {
                books.remove(b);
                System.out.println("Book removed: " + b.title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(int bookID) {
        for (Book b : books) {
            if (b.bookID == bookID) {
                System.out.println("Book found:");
                b.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        System.out.println("All books in library:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}
