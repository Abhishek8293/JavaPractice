package string;

public class StringBuilderOperations {
	public static void main(String[] args) {
		// Create a StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Hello");

		// Append
		stringBuilder.append(" Universe");
		System.out.println("After appending: " + stringBuilder);

		// Insert
		stringBuilder.insert(5, ", Java");
		System.out.println("After inserting: " + stringBuilder);

		// Replace
		stringBuilder.replace(6, 11, "World");
		System.out.println("After replacing: " + stringBuilder);

		// Delete
		stringBuilder.delete(6, 13);
		System.out.println("After deleting: " + stringBuilder);

		// Reverse
		stringBuilder.reverse();
		System.out.println("After reversing: " + stringBuilder);

		// Capacity
		int capacity = stringBuilder.capacity();
		System.out.println("Capacity: " + capacity);

		// Length
		int length = stringBuilder.length();
		System.out.println("Length: " + length);

		// Set length
		stringBuilder.setLength(5);
		System.out.println("After setting length: " + stringBuilder);

		// Get character at specific index
		char charAtIndex = stringBuilder.charAt(2);
		System.out.println("Character at index 2: " + charAtIndex);

		// Substring
		String substring = stringBuilder.substring(1, 3);
		System.out.println("Substring from index 1 to 3: " + substring);

	}
}
