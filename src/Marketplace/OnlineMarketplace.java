package Marketplace;

import java.util.PriorityQueue;

public class OnlineMarketplace {
	 private static PriorityQueue<Product> priorityQueue;

	public static void main(String[] args) {
		// Create a custom comparator for products
		priorityQueue = new PriorityQueue<>();

		// Priority queue with custom comparator
		PriorityQueue<Product> productQueue = new PriorityQueue<>();

		// Add products to the queue
		productQueue.add(new Product("Laptop", 1500.0, 1));
		productQueue.add(new Product("Smartphone", 600.0, 3));
		productQueue.add(new Product("Headphones", 100.0, 2));
		productQueue.add(new Product("Smartwatch", 300.0, 2));
		productQueue.add(new Product("Tablet", 400.0, 3));

		// Print products based on priority
		System.out.println("Products sorted by priority:");
		while (!productQueue.isEmpty()) {
			System.out.println(productQueue.poll());
		}
	}
}

