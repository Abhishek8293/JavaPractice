package arraysPractice;

public class LeftShift {

	// Brute Force Approach
	// TC = O(N-1) but we can ignore the constant
	// SC = O(1)

	public static int[] leftShift(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] inp = { 1 };
		int[] ans = leftShift(inp);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
