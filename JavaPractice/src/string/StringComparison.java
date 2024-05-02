package string;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "world";
		String str3 = "Hello";

		System.out.println(str1.equals(str2)); 
		System.out.println(str1.equals(str3)); 

		System.out.println(str1 == str2); 
		System.out.println(str1 == str3); 

		System.out.println(str1.equalsIgnoreCase(str2)); 
		System.out.println(str1.equalsIgnoreCase(str3)); 

		System.out.println(str1.compareTo(str2)); 
		System.out.println(str1.compareTo(str3)); 
	}

}
