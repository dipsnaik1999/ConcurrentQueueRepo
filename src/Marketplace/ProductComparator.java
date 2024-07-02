package Marketplace;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

		@Override
		public int compare(Product p1, Product p2) {
			// Compare products based on priority
			int priorityComparison = Integer.compare(p1.getPriority(), p2.getPriority());
			if (priorityComparison == 0) {
				// If priorities are the same, compare based on name
				return p1.getName().compareTo(p2.getName());
			}
			return priorityComparison;
		}
	}

