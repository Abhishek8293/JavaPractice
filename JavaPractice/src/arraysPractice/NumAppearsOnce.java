package arraysPractice;

import java.util.HashMap;

public class NumAppearsOnce {

	// Brute Force Approach
	// TC = O(NlogM+M) M is the size of map.
	// SC = O(M)
	public static int singleNumber(int[] arr) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}
		for (Integer i : mp.keySet()) {
			if (mp.get(i) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] inp = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(inp));
	}

}
