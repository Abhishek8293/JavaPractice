package basicMath;

public class ContDigit {
	
	// Using while loop TC- O(logN)
		public static int digitCount(int n) {
			int cnt=0;
			while(n>0) {
				n=n/10;
				cnt++;
			}
			return cnt;
		}
		
		//Using String conversion TC-O(1)
		public static int strCount(int n) {
			String str = Integer.toString(n);
			return str.length();
			
		}
		
		//Using log TC-O(1)
		public static int logCount(int n) {
			int digit =(int) Math.floor(Math.log10(n));
			return digit+1;
		}
		
		
		
		public static void main(String[] args) {
			System.out.println(digitCount(8394));
			System.out.println(strCount(8394));
			System.out.println(logCount(8394));
			
		}

}
