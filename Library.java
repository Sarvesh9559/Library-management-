 import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        System.out.println("\nAll Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + b);
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
 
