package basicMath;

public class Palindrome {
	
	public static boolean checkPalindrome(int n) {
		int num=n;
		int revNum=0;
		while(num!=0) {
			int rem=num%10;
			revNum = revNum*10+rem;
			num=num/10;
		}
		if(n == revNum) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome(1234321));
	}

}
