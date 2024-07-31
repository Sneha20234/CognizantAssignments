package Sorting_Customer_Orders;

import java.util.Arrays;

public class SortDemo {
	public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 150.75),
            new Order("003", "Charlie", 320.00),
            new Order("004", "David", 120.00),
            new Order("005", "Eve", 450.25)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        SortingAlgorithms.bubbleSort(bubbleSortedOrders);
        System.out.println("Orders sorted by Bubble Sort:");
        Arrays.stream(bubbleSortedOrders).forEach(System.out::println);

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        SortingAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders sorted by Quick Sort:");
        Arrays.stream(quickSortedOrders).forEach(System.out::println);
    }
}
