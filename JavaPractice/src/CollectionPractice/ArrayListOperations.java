package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//creating and performing all the operations on arraylist.
public class ArrayListOperations {
	public static void main(String[] args) {

		// create an ArrayList using List interface
		List<String> list = new ArrayList<>();

		// Create an list using ArrayList class
		ArrayList<String> arrayList = new ArrayList<>();

		// Add elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		System.out.println("after adding elements: " + arrayList);

		// Get size
		int size = arrayList.size();
		System.out.println("Size of arrayList: " + size);

		// Get element at index
		String elementAtIndex = arrayList.get(1);
		System.out.println("Element at index 1: " + elementAtIndex);

		// Modify element at index
		arrayList.set(2, "Mango");
		System.out.println("ArrayList after modifying element at index 2: " + arrayList);

		// Remove element at index
		arrayList.remove(0);
		System.out.println("arrayList after removing element at index 0: " + arrayList);

		// Iterate using enhanced for loop
		System.out.println("Iterating using enhanced for loop:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}

		// Iterate using iterator
		System.out.println("Iterating using iterator:");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Check if ArrayList contains an element
		boolean containsBanana = arrayList.contains("Banana");
		// true if contains false if not contains
		System.out.println(containsBanana);

		// IndexOf
		int indexOfMango = arrayList.indexOf("Mango");
		System.out.println("Index of 'Mango': " + indexOfMango);

		// Clear
		arrayList.clear();
		System.out.println("ArrayList after clearing: " + arrayList);

		// Check if ArrayList is empty
		boolean isEmpty = arrayList.isEmpty();
		System.out.println("Is ArrayList empty? " + isEmpty);
	}
}
