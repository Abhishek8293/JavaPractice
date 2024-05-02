package arraysPractice;

public class LeftShiftByK {

	// Brute Force Approach
	// TC = O(K+N-K+K) = O(N+K)
	// SC = O(K)
	public static void leftShift(int[] arr, int k) {
		if (k == 0 || k == arr.length) {
			return;
			// if the k is 0 or equals to the length of array then array will be same
		} else if (k > arr.length) {
			k = k % arr.length;
			// if k is greater than the array length then modulo will be the actual value of
			// k
		}
		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0; i < arr.length - k; i++) {
			arr[i] = arr[i + k];
		}

		for (int i = 0; i < k; i++) {
			arr[arr.length - k + i] = temp[i];
		}

	}

	public static void main(String[] args) {
		int[] inp = { 3, 7, 8, 9, 10, 11 };
		int k = 15;
		leftShift(inp, k);
		for (int i : inp) {
			System.out.print(i + " ");
		}
	}

}
