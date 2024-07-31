package libraryManagement;

public class LibraryManagementDemo {
	 public static void main(String[] args) {
	        Library library = new Library(10);

	        // Adding books
	        library.addBook(new Book("001", "The Great Gatsby", "F. Scott Fitzgerald"));
	        library.addBook(new Book("002", "1984", "George Orwell"));
	        library.addBook(new Book("003", "To Kill a Mockingbird", "Harper Lee"));

	        // Performing linear search
	        Book foundBook = library.searchByTitleLinear("1984");
	        if (foundBook != null) {
	            System.out.println("Book found with linear search: " + foundBook);
	        } else {
	            System.out.println("Book not found with linear search.");
	        }

	        // Sorting books by title
	        library.sortBooksByTitle();

	        // Performing binary search
	        foundBook = library.searchByTitleBinary("1984");
	        if (foundBook != null) {
	            System.out.println("Book found with binary search: " + foundBook);
	        } else {
	            System.out.println("Book not found with binary search.");
	        }

	        // Printing all books
	        System.out.println("All books in the library:");
	        library.printAllBooks();
	    }
}
