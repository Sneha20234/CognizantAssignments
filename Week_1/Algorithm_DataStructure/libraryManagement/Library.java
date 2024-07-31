package libraryManagement;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
	 private Book[] books;
	    private int size;

	    public Library(int capacity) {
	        books = new Book[capacity];
	        size = 0;
	    }

	    // Method to add a book
	    public void addBook(Book book) {
	        if (size < books.length) {
	            books[size++] = book;
	        } else {
	            System.out.println("Library is full.");
	        }
	    }

	    // Method to sort books by title
	    public void sortBooksByTitle() {
	        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));
	    }

	    // Method to search for a book by title using linear search
	    public Book searchByTitleLinear(String title) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        return null;
	    }

	    // Method to search for a book by title using binary search
	    public Book searchByTitleBinary(String title) {
	        int left = 0;
	        int right = size - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

	            if (comparison == 0) {
	                return books[mid];
	            } else if (comparison < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return null;
	    }

	    // Method to print all books
	    public void printAllBooks() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(books[i]);
	        }
	    }
}
