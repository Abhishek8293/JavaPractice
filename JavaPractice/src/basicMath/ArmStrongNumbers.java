package basicMath;

public class ArmStrongNumbers {
	
	public static boolean armstrong(int n) {
		int num=n;
		String str = Integer.toString(n);
		int sum=0;
		while(num!=0) {
			int rem = num%10;
			sum +=(int) Math.pow(rem, str.length());
			num = num/10;
		}
		if(n == sum) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(armstrong(170));
	}

}
