package librarymanagement;
import java.util.ArrayList;

public class Library {

	    private ArrayList<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    // Add a new book
	    public boolean addBook(Book book) {

	        // Check duplicate ID
	        for (Book b : books) {
	            if (b.getBookId() == book.getBookId()) {
	                return false;
	            }
	        }

	        books.add(book);
	        return true;
	    }

	    // View all books
	    public void viewBooks() {

	        if (books.isEmpty()) {
	            System.out.println("No books available in the library.");
	            return;
	        }

	        System.out.println("\n===== All Books =====");

	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    // Search by ID
	    public Book searchById(int bookId) {

	        for (Book book : books) {
	            if (book.getBookId() == bookId) {
	                return book;
	            }
	        }

	        return null;
	    }

	    // Search by title
	    public void searchByTitle(String title) {

	        boolean found = false;

	        for (Book book : books) {

	            if (book.getTitle().toLowerCase()
	                    .contains(title.toLowerCase())) {

	                System.out.println(book);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("Book not found.");
	        }
	    }

	    // Issue book
	    public boolean issueBook(int bookId) {

	        Book book = searchById(bookId);

	        if (book == null) {
	            System.out.println("Book ID not found.");
	            return false;
	        }

	        if (!book.isAvailable()) {
	            System.out.println("Book is already issued.");
	            return false;
	        }

	        book.setAvailable(false);
	        System.out.println("Book issued successfully.");
	        return true;
	    }

	    // Return book
	    public boolean returnBook(int bookId) {

	        Book book = searchById(bookId);

	        if (book == null) {
	            System.out.println("Book ID not found.");
	            return false;
	        }

	        if (book.isAvailable()) {
	            System.out.println("This book is already available.");
	            return false;
	        }

	        book.setAvailable(true);
	        System.out.println("Book returned successfully.");
	        return true;
	    }

	    // Remove book
	    public boolean removeBook(int bookId) {

	        Book book = searchById(bookId);
	        
	        if (book == null) {
	            System.out.println("Book ID not found.");
	            return false;
	        }

	        if (!book.isAvailable()) {
	            System.out.println("Cannot remove an issued book.");
	            return false;
	        }

	        books.remove(book);
	        System.out.println("Book removed successfully.");
	        return true;
	    }
	

}
