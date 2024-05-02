package string;

public class StringOperations {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		// Concatenation
		String concatenated = str1 + ", " + str2;
		System.out.println("Concatenated string: " + concatenated);

		// Length
		int length = concatenated.length();
		System.out.println("Length of the string: " + length);

		// Substring
		String substring = concatenated.substring(7, 12);
		System.out.println("Substring: " + substring);

		// IndexOf
		int indexOfWorld = concatenated.indexOf("World");
		System.out.println("Index of 'World': " + indexOfWorld);

		// Replace
		String replaced = concatenated.replace("Hello", "Hola");
		System.out.println("After replacement: " + replaced);

		// Uppercase and Lowercase
		String uppercase = concatenated.toUpperCase();
		String lowercase = concatenated.toLowerCase();
		System.out.println("Uppercase: " + uppercase);
		System.out.println("Lowercase: " + lowercase);

		// Trim
		String stringWithSpaces = "   Trim me!   ";
		String trimmed = stringWithSpaces.trim();
		System.out.println("Trimmed string: " + trimmed);

		// Split
		String sentence = "I am learning Java programming";
		String[] words = sentence.split(" ");
		System.out.println("Words in the sentence:");
		for (String word : words) {
			System.out.println(word);
		}

		// Check if a string contains another string
		boolean contains = concatenated.contains("World");
		System.out.println("Does the string contain 'World'? " + contains);

		// Compare strings
		String str3 = "hello";
		String str4 = "HELLO";
		boolean equalsIgnoreCase = str3.equalsIgnoreCase(str4);
		System.out.println("Are 'hello' and 'HELLO' equal (ignore case)? " + equalsIgnoreCase);
	}
}
