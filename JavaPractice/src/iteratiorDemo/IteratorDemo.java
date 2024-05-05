package iteratiorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Add elements to the list
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Get an Iterator for the ArrayList
		Iterator<String> iterator = list.iterator();

		// Iterate over the elements using the Iterator
		System.out.println("--------Iterating over the elements using Iterator--------");
		while ( iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// Remove an element using Iterator's remove method
		iterator = list.iterator(); // Reset the iterator
		System.out.println("-------------Removing 'Banana' using Iterator's remove method--------------");
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.equals("Banana")) {
				iterator.remove();
			}
		}

		// Print the updated list
		System.out.println("List after removing 'Banana':-- " + list);
	}
}
