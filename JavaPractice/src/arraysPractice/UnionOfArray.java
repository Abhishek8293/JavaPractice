package arraysPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class UnionOfArray {

	// Brute Force Approach
	// TC = O(N)+O(M)+O(N*N)
	// SC = O(M+N)
	public static HashSet<Integer> union(int[] arr1, int[] arr2) {
		HashSet<Integer> arr1Set = new HashSet<Integer>();
		HashSet<Integer> arr2Set = new HashSet<Integer>();
		for (int i : arr1) {
			arr1Set.add(i);
		}
		for (int i : arr2) {
			arr2Set.add(i);
		}
		arr1Set.addAll(arr2Set);
		return arr1Set;
	}

	// 2nd Approach
	// TC = O((M+N)*log(M+N)) M is the length of first array and N is the length of
	// second array.
	// SC = O(N) where N is the size of the TreeSet
	public static TreeSet<Integer> union1(int[] arr1, int[] arr2) {
		TreeSet<Integer> unionSet = new TreeSet<>();
		for (int i : arr1) {
			unionSet.add(i);
		}
		for (int i : arr2) {
			unionSet.add(i);
		}
		return unionSet;
	}

	// Optimal solution
	// TC = O(N+M)
	// SC = O(N+M)
	public static ArrayList<Integer> union3(int[] arr1, int[] arr2, int m, int n) {
		ArrayList<Integer> unionList = new ArrayList<Integer>();
		int ptr1 = 0;
		int ptr2 = 0;
		int prev = 0;

		while (ptr1 < m && ptr2 < n) {
			if (arr1[ptr1] <= arr2[ptr2] && arr1[ptr1] != prev) {
				unionList.add(arr1[ptr1]);
				prev = arr1[ptr1];
				ptr1++;
			} else if (arr2[ptr2] != prev) {
				ptr1++;
				unionList.add(arr2[ptr2]);
				prev = arr2[ptr2];
				ptr2++;
			} else {
				// ptr1++;
				ptr2++;

			}
		}

		// From both bellows while loop One loop will only run
		while (ptr1 < m) {
			if (arr1[ptr1] != prev) {
				unionList.add(arr1[ptr1]);
				ptr1++;
			} else {
				ptr1++;
			}
		}

		while (ptr2 < n) {
			if (arr2[ptr2] != prev) {
				unionList.add(arr2[ptr2]);
				ptr2++;
			} else {
				ptr2++;
			}
		}
		return unionList;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

		// HashSet<Integer> hs= union(arr1,arr2);
		// System.out.println(union1(arr1,arr2));
		System.out.println(union3(arr1, arr2, arr1.length, arr2.length));

	}

}
