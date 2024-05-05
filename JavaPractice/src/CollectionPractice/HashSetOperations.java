package CollectionPractice;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetOperations {
	public static void main(String[] args) {

		// HashSet of Integers (doesn't allow duplicates)
		HashSet<Integer> numbers = new HashSet<>();

		// Add elements to the HashSet
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20); // Duplicate will be ignored

		System.out.println("Numbers (HashSet): " + numbers);

		// Get the size of the HashSet
		System.out.println("Size of HashSet: " + numbers.size());

		// Check if an element exists
		System.out.println("Contains 5 : " + numbers.contains(5));

		// Remove an element by value
		numbers.remove(10);

		// Iterate through the HashSet using enhanced for loop
		for (int number : numbers) {
			System.out.println(number);
		}

		// Iterate through the HashSet using iterator
		java.util.Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			int number = iterator.next();
			System.out.println("Using Iterator:- " + number);
		}
	}
}
