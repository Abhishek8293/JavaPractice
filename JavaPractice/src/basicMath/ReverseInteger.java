package basicMath;

public class ReverseInteger {
	public static int reverse(int x) {
		long n = Math.abs((long) x); // Take absolute value to handle negative cases
        long rev = 0;

        while (n != 0) {
            int rem = (int) (n % 10);
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (rev > Integer.MAX_VALUE) {
            return 0;
        }

        if (x < 0) {
            return (int) (-1 * rev);
        }

        return (int) rev;
	        }
	        
	
	public static void main(String[] args) {
		System.out.println(reverse(-234));
	}

}
