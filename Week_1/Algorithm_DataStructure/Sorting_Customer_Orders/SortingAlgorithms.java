package Sorting_Customer_Orders;

public class SortingAlgorithms {
	 public static void bubbleSort(Order[] orders) {
	        int n = orders.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
	                    // Swap orders[j] and orders[j+1]
	                    Order temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no two elements were swapped in the inner loop, then break
	            if (!swapped) break;
	        }
	    }

	    public static void quickSort(Order[] orders, int low, int high) {
	        if (low < high) {
	            // pi is partitioning index, orders[pi] is now at right place
	            int pi = partition(orders, low, high);

	            // Recursively sort elements before partition and after partition
	            quickSort(orders, low, pi - 1);
	            quickSort(orders, pi + 1, high);
	        }
	    }

	    private static int partition(Order[] orders, int low, int high) {
	        double pivot = orders[high].getTotalPrice();
	        int i = (low - 1); // index of smaller element
	        for (int j = low; j < high; j++) {
	            // If current element is smaller than or equal to pivot
	            if (orders[j].getTotalPrice() <= pivot) {
	                i++;

	                // Swap orders[i] and orders[j]
	                Order temp = orders[i];
	                orders[i] = orders[j];
	                orders[j] = temp;
	            }
	        }

	        // Swap orders[i+1] and orders[high] (or pivot)
	        Order temp = orders[i + 1];
	        orders[i + 1] = orders[high];
	        orders[high] = temp;

	        return i + 1;
	    }
}
