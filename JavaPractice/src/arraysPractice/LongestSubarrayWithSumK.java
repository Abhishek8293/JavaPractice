package arraysPractice;

public class LongestSubarrayWithSumK {
	// Brute Force Approach
	// TC = O(N*N*N)
	// SC = O(1)
	public static int longestSubarray(int[] arr, int k) {
		int n = arr.length;
		int len = 0;
		for (int i = 0; i < n; i++) {
			for (int m = i; m < n; m++) {
				int sum = 0;
				for (int j = i; j <= m; j++) {
					sum += arr[j];
				}
				if (sum == k) {
					len = Math.max(len, m - i + 1);
				}
			}
		}

		return len;
	}

	// Better Approach
	// TC = O(N*N)
	// SC = O(1)
	public static int longestSubarray1(int[] arr, int k) {
		int n = arr.length;
		int len = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == k) {
					len = Math.max(len, j - i + 1);
				}
			}
		}

		return len;
	}

	public static void main(String[] args) {
		int[] inp = { 2, 3, 5, 2, 2, 4 };
		int k = 8;
		System.out.println(longestSubarray1(inp, k));
	}

}
