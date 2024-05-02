package arraysPractice;

import java.util.Arrays;

public class FindMissingNum {
	// Brute Force Approach
	// TC = O(N*N)
	// SC=O(1)
	public static int findNum1(int[] arr, int n) {
		for (int i = 1; i <= n; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = 1;
				}
			}
			if (flag == 0)
				return i;
		}
		return -1;
	}

	// Better Approach
	// TC= O(N)+NlogN
	// SC =O(1)
	public static int findNum(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				return arr[i] - 1;
			}
		}
		return -1;
	}

	// Hashing Approach
	// TC = O(N+N+1)
	// SC = O(N+1)
	public static int findNum2(int[] arr, int n) {
		int[] hash = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]] = 1;
		}
		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	// Optimal Approach
	// TC = O(N)
	// SC = O(N)
	public static int findNum3(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		int totalSum = (n * (n + 1)) / 2;
		return totalSum - sum;
	}

	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int n = 9;
		System.out.println(findNum2(inp, n));
	}

}
