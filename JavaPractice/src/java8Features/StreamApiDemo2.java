package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class StreamApiDemo2 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Laptop"));
		products.add(new Product(2, "Phone"));
		products.add(new Product(3, "Headphones"));
		products.add(new Product(4, "Tablet"));
		products.add(new Product(5, "Watch"));

		// Filtering and collection the product which id is greater than 2
		List<Integer> productIds = products.stream().filter(product -> product.id > 2).map(mapId -> mapId.id)
				.collect(Collectors.toList());

		System.out.println(productIds);
	}
}
