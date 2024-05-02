package arraysPractice;

public class LargestElement {

	public static int largestElement(int[] arr) {
		int largestElement = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestElement) {
				largestElement = arr[i];
			}
		}
		return largestElement;
	}

	public static void main(String[] args) {
		int[] inp = { 8, 10, 5, 7, 9 };
		System.out.println(largestElement(inp));
	}

	// TC = O(N) where N is the length of input array
	// SC = O(1)
}
