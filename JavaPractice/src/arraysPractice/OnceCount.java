package arraysPractice;

public class OnceCount {
	// Brute Force Approach
	// TC = O(N)
	// SC = O(1)
	public static int oneCount(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}
		}
		if (count > maxCount) {
			maxCount = count;
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] inp = { 1, 0, 1, 1, 0, 1 };
		System.out.println(oneCount(inp));
	}
}
