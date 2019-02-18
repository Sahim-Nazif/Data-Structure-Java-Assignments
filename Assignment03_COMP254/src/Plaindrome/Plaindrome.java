package Plaindrome;

public class Plaindrome {

	public static void main(String[] args) {
		
		
		

	}
	
	//Declaring a recursive boolean function
	public static boolean isPliandrom(String input) {
		if (input==null ||input.isEmpty()) {
			return true;
		}
		char []array=input.toCharArray();
		StringBuilder sb=new StringBuilder(input.length());
		for (int i=input.length()-1; i>=0;i--) {
			sb.append(array[i]);
		}
		String reverseOfString=sb.toString();
		return input.equals(reverseOfString);
		
	}

}
