package CollectionPractice;

import java.util.Vector;

public class VectorOperations{
	
	public static void main(String[] args) {
		
	

	        // Create a Vector of Strings
	        Vector<String> fruits = new Vector<>();

	        // Add elements to the Vector
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.addElement("Mango"); // addElement() is a legacy method, same as add()

	        System.out.println("Fruits Vector: " + fruits);

	        // Get the size of the Vector
	        int size = fruits.size();
	        System.out.println("Size of Vector: " + size);

	        // Access elements by index
	        String firstFruit = fruits.get(0);
	        System.out.println("First Fruit: " + firstFruit);

	        // Check if an element exists
	        boolean hasGrape = fruits.contains("Grape");
	        System.out.println("Contains Grape? " + hasGrape);

	        // Insert an element at a specific index
	        fruits.insertElementAt("Kiwi", 1);
	        System.out.println("Fruits Vector after insertion: " + fruits);

	        // Remove an element by index
	        fruits.remove(2); // removes element at index 2 (Orange)
	        System.out.println("Fruits Vector after removal: " + fruits);

	        // Remove the first occurrence of an element
	        fruits.remove("Banana");
	        System.out.println("Fruits Vector after removing Banana: " + fruits);

	        // Iterate through the Vector
	        for (int i = 0; i < fruits.size(); i++) {
	            System.out.println("Fruit at index " + i + ": " + fruits.get(i));
	        }
	    }
		
	
	
	
	
}