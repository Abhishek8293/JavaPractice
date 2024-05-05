package CollectionPractice;

import java.util.Iterator;
import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {

		// Create a Vector of Strings
		Vector<String> fruits = new Vector<>();

		// Add elements to the Vector
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.addElement("mango"); // addElement() is a legacy method, same as add()

		System.out.println("Fruits Vector: " + fruits);

		// Get the size of the Vector
		System.out.println("Size of Vector: " + fruits.size());

		// Access elements by index
		System.out.println("First Fruit: " + fruits.get(0));

		// Check if an element exists
		System.out.println("Contains Grape? " + fruits.contains("grape"));

		// Insert an element at a specific index
		fruits.insertElementAt("kiwi", 1);
		System.out.println("Fruits Vector after insertion: " + fruits);

		// Remove an element by index
		fruits.remove(2);
		System.out.println("Fruits Vector after removal: " + fruits);

		// Remove the first occurrence of an element
		fruits.remove("banana");
		System.out.println("Fruits Vector after removing Banana: " + fruits);

		// Iterate through the Vector
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("Fruit at index " + i + ":- " + fruits.get(i));
		}

		System.out.println("---------------- USING ITERATOR -----------------");

		Iterator<String> iterator = fruits.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}