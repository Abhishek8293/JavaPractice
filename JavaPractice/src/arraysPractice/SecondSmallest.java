package arraysPractice;

public class SecondSmallest {
	public static int secondSmallest(int[] arr) {
		int smallest = arr[0];
		int secSmallest = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] < secSmallest) {
				secSmallest = arr[i];
			}
		}
		return secSmallest;

	}

	public static void main(String[] args) {
		int[] inp = { 1, 2, 6, 4, 7, 7, 5 };
		System.out.println(secondSmallest(inp));
	}
}
