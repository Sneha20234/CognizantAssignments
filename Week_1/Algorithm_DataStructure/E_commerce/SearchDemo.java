package E_commerce;

public class SearchDemo {

	public static void main(String[] args) {

		Product[] products = {
	            new Product("101", "Laptop", "Electronics"),
	            new Product("102", "Smartphone", "Electronics"),
	            new Product("103", "Tablet", "Electronics"),
	            new Product("104", "Headphones", "Accessories"),
	            new Product("105", "Charger", "Accessories")
	        };

	        // Linear Search
	        Product foundProductLinear = LinearSearch.linearSearch(products, "Smartphone");
	        if (foundProductLinear != null) {
	            System.out.println("Product found using linear search: " + foundProductLinear);
	        } else {
	            System.out.println("Product not found using linear search.");
	        }

	        // Binary Search
	        Product foundProductBinary = BinarySearch.binarySearch(products, "Smartphone");
	        if (foundProductBinary != null) {
	            System.out.println("Product found using binary search: " + foundProductBinary);
	        } else {
	            System.out.println("Product not found using binary search.");
	        }
	}

}
