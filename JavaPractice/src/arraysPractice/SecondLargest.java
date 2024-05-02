package arraysPractice;

import java.util.Arrays;

public class SecondLargest {

	public static int secondLargest(int[] arr) {
		if (arr.length <= 1) {
			return -1;
		}
		Arrays.sort(arr);
		int largest = arr[arr.length - 1];
		int idx = arr.length - 2;
		for (int i = idx; i >= 0; i--) {
			if (arr[i] < largest) {
				return arr[i];
			}
		}
		return -1;

	}

	// TC = O(N+N) = O(2N)
	public static int secondLargest1(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		int secLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secLargest && arr[i] < largest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}

	// TC = O(N)
	public static int secondLargest2(int[] arr) {
		int largest = arr[0];
		int secLargest = -1; // Assumption is that the array does not contain negative value.
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secLargest && arr[i] < largest) {
				secLargest = arr[i];
			}

		}
		return secLargest;

	}

	// For all three method the space complexity is O(1)
	// For second smallest use Integer.MAX_VALUE second smallest number
	public static void main(String[] args) {
		int[] inp = { 1, 2, 6, 4, 7, 7, 5 };
		System.out.println(secondLargest2(inp));
	}

}
