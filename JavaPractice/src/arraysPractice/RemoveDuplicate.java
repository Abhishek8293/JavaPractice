package arraysPractice;

import java.util.HashSet;

public class RemoveDuplicate {
	// Brute Force Approach
	// TC = O(N+N)
	// SC = O(N)
	public static int removeDp(int[] arr) {
		HashSet<Integer> uniqueElement = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			uniqueElement.add(arr[i]);
		}
		int k = uniqueElement.size();
		int i = 0;
		for (Integer item : uniqueElement) {
			arr[i] = item;
			i++;
		}
		return k;

	}

	// TC = O(N)
	// SC = O(1)
	// Optimal Approach
	public static int rDuplicate(int[] arr) {
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[index]) {
				arr[index + 1] = arr[i];
				index++;
			}
		}
		return index + 1;

	}

	public static void main(String[] args) {
		int inp[] = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5 };
		System.out.println(rDuplicate(inp));
		for (int i : inp) {
			System.out.print(i + " ");
		}
	}

}
