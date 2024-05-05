package CollectionPractice;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {

		// Create a Stack of Strings
		Stack<String> books = new Stack<>();

		// Push elements onto the Stack (LIFO - Last In First Out)
		books.push("Java");
		books.push("DSA");
		books.push("Python");

		System.out.println("Books Stack: " + books);

		// Check if the Stack is empty
		System.out.println("Is Stack empty? " + books.isEmpty());

		// Peek at the top element (without removing)
		System.out.println("Top book : " + books.peek());

		// Pop elements from the Stack (removes and returns)
		System.out.println("Popped Book : " + books.pop());

		System.out.println("Books Stack after pops: " + books);

		// Search for an element (returns the position from the top)
		System.out.println("Position of 'Java' : " + books.search("Java")); // if not found returns -1

		for (String s : books) {
			System.out.println(" > " + s);
		}
	}

}
