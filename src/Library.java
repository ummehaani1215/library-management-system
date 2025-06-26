import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void showAllBooks() {
        for (Book b : books) {
            String status = b.isIssued() ? "Issued" : "Available";
            System.out.println(b.getTitle() + " by " + b.getAuthor() + " [" + status + "]");
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available for issue: " + title);
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued: " + title);
    }
}
