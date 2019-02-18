package Plaindrome;

import java.util.Scanner;
/*Assignment Question 2:
 * Recursive Java method that determines if a string s is a palindrome, that is, it is equal
 * to its reverse.
 */

public class Plaindrome {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter a string : ");
		String input = reader.nextLine();

		System.out.println("Is a plaindrome : " + "  " + input + "  " + isPlaindrome(input));
		System.out.print("Please center another string : ");
		input = reader.nextLine();

		System.out.println("Is a plaindrome : " + "  " + input + "  " + isPlaindrome(input));
		reader.close();

	}

	// Declaring a recursive boolean function
	public static boolean isPlaindrome(String input) {
		if (input == null || input.isEmpty()) {
			return true;
		}
		char[] array = input.toCharArray();
		StringBuilder sb = new StringBuilder(input.length());
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(array[i]);
		}
		String reverseOfString = sb.toString();
		return input.equals(reverseOfString);

	}

}
