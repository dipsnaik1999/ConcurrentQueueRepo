package Marketplace;

class Product implements Comparable<Product> {

	private String name;
	private double price;
	private int priority;
	
	public Product(String name, double price, int priority) {
		this.name = name;
		this.price = price;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getPriority() {
		return priority;
	}
	
	// Override compareTo method to compare products based on priority
	
    public int compareTo(Product other) {
    	
        // Higher priority products (lower priority number) come first
    	
        return Integer.compare(this.priority, other.priority);
    }
	@Override
	public String toString() {
		return "Product{name='" + name + "', price=" + price + ", priority=" + priority + "}";
	}

}
