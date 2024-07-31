import java.util.HashMap;
import java.util.Map;


 class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
    }
}

public class InventoryManagementSystem {
	private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to display all products
    public void displayAllProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InventoryManagementSystem ims = new InventoryManagementSystem();

	        // Adding products
	        ims.addProduct(new Product("101", "Laptop", 10, 999.99));
	        ims.addProduct(new Product("102", "Smartphone", 20, 499.99));

	        // Display all products
	        System.out.println("All products:");
	        ims.displayAllProducts();

	        // Update a product
	        ims.updateProduct("101", new Product("101", "Laptop", 15, 949.99));
	        System.out.println("After updating product 101:");
	        ims.displayAllProducts();

	        // Delete a product
	        ims.deleteProduct("102");
	        System.out.println("After deleting product 102:");
	        ims.displayAllProducts();

	}

}
