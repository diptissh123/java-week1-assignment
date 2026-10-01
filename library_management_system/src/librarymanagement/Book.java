package librarymanagement;

public class Book {

	    private int bookId;
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    // Constructor
	    public Book(int bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;
	    }

	    // Getters
	    public int getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    // Setter
	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + bookId +
	               " | Title: " + title +
	               " | Author: " + author +
	               " | Status: " +
	               (isAvailable ? "Available" : "Issued");
	    }
	}

