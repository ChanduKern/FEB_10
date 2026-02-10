import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    throw new BookNotAvailableException("Book already issued!");
                }
                book.issueBook();
                System.out.println("Book issued successfully");
                return;
            }
        }
        throw new BookNotAvailableException("Book not found!");
    }

    public void returnBook(int bookId, int lateDays) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.returnBook();
                System.out.println("Book returned successfully");

                if (lateDays > 0) {
                    int fine = lateDays * 10;
                    System.out.println("Late fine: ₹" + fine);
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
        displayBooks();
    }

    public void sortByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
        displayBooks();
    }

    public void displayBooks() {
        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            System.out.println(
                    b.getId() + " | " + b.getTitle() +
                            " | " + b.getAuthor() +
                            " | Issued: " + b.isIssued());
        }
    }
}
