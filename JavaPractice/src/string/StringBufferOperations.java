package string;

public class StringBufferOperations {

	public static void main(String[] args) {
		// Create a StringBuffer
		StringBuffer stringBuffer = new StringBuffer("Hello");

		// Append
		stringBuffer.append(" World");
		System.out.println("After appending: " + stringBuffer);

		// Insert
		stringBuffer.insert(5, ", Java");
		System.out.println("After inserting: " + stringBuffer);

		// Replace
		stringBuffer.replace(6, 11, "Universe");
		System.out.println("After replacing: " + stringBuffer);

		// Delete
		stringBuffer.delete(6, 15);
		System.out.println("After deleting: " + stringBuffer);

		// Reverse
		stringBuffer.reverse();
		System.out.println("After reversing: " + stringBuffer);

		// Capacity
		int capacity = stringBuffer.capacity();
		System.out.println("Capacity: " + capacity);

		// Length
		int length = stringBuffer.length();
		System.out.println("Length: " + length);

		// Set length
		stringBuffer.setLength(5);
		System.out.println("After setting length: " + stringBuffer);

		// Get character at specific index
		char charAtIndex = stringBuffer.charAt(2);
		System.out.println("Character at index 2: " + charAtIndex);

		// Substring
		String substring = stringBuffer.substring(1, 3);
		System.out.println("Substring from index 1 to 3: " + substring);

		// Clear
		stringBuffer.delete(0, stringBuffer.length());
		System.out.println("After clearing: " + stringBuffer);
	}

}
