package basicMath;

public class GCD {
	
	public static int gcd(int num1,int num2) {
		/*int gcd=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				if(i>gcd) {
					gcd=i;
				}
			}
		}
		return gcd;*/
		
		if(num2==0) {
			return num1;
		}
		return gcd(num2,num1%num2);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(8,16));
	}

}
