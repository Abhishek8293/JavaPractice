package arraysPractice;

public class LinearSearch {
	// TC = O(N)
	// SC = O(1)
	public static int findNum(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 4, 5 };
		int n = 9;
		System.out.println(findNum(inp, n));
	}
}
