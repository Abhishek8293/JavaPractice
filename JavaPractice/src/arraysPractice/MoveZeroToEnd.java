package arraysPractice;

import java.util.ArrayList;

public class MoveZeroToEnd {
	// Brute Force Approach
	// TC = O(N)+O(N) = O(2N)
	// SC = O(N)
	public static void moveZero(int[] arr, int n) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				nums.add(arr[i]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (i < nums.size()) {
				arr[i] = nums.get(i);
			} else {
				arr[i] = 0;
			}
		}

	}

	// Optimal Approach
	// TC = O(N)
	// SC = O(1)
	public static int[] moveZero1(int[] arr) {
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1)
			return arr;
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] inp = { 1, 0, 2, 3, 0, 4, 0, 1 };
		// moveZero(inp,inp.length);
		moveZero1(inp);
		for (int i : inp) {
			System.out.print(i + " ");
		}
	}

}
