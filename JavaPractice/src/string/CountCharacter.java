package string;

public class CountCharacter {

	public static void main(String[] args) {
		String string = "Microsoft";
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < string.length(); i++) {
			count++;
		}

		System.out.println("number of characters: " + count);
	}

}
