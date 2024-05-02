package arraysPractice;

public class ArrayIsSortedOrNot {
	// Worst case TC = O(N)| SC = O(1)
	public static boolean arraySorted(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int inp[] = { 1, 2, 0, 4, 5 };
		System.out.println(arraySorted(inp, inp.length));
	}
}
