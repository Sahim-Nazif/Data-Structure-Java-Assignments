package BigOCharacterization;

 /*  Student Name: Nazif Sahim
 Student ID: 300886750
 Description: Assignment 2
 Course: COMP254
 Instructor: Reza Dibaj
 Date: 14 Feb 2019
------------------------------

* Question 1: Give a big-Oh characterization, in terms of n, of the running time of the example1
*  method from Exercises class in Lesson 4 examples
*/
class Exercises {

	/** Returns the sum of the integers in given array. */
	public static int example1(int[] arr) { // O(1)
		int n = arr.length, total = 0; // O(1)
		for (int j = 0; j < n; j++) // loop from 0 to n-1 // O(n)
			total += arr[j];
		return total;
	}

//Declaring main method to test the array and return maximum (greatest)number in the array
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 10, 20 };
		int sum;
		sum = example1(array);
		System.out.println("This is the result of the sum from Example 1");
		System.out.println(sum);
		System.out.println("--------------------------------------------");

		/*
		 * Explanation: We know that while loop runs (n) times, so even if we count
		 * total time such as O(1) +O(1) +(O(n). Since we drop lower term and we look
		 * for the worse case therefore the answer is O(n).
		 * 
		 */

		// Testing Exmaple2 here
		int[] array2 = { 12, 3, 4, 5, 11, 9 };
		int evenIndexSum;
		evenIndexSum = example2(array2);
		System.out.println("\nResult of the sum of numbers with even index from Example 2");
		System.out.println(evenIndexSum);
		System.out.println("-----------------------------------------------------------");

		// Testing Example 3 here

		int[] array3 = { 7, 1, 8, 2, 13, 17 };
		int prefixSum;
		prefixSum = example3(array3);
		System.out.println("Result of the prefix sum of  Example 3");
		System.out.println(prefixSum);
		System.out.println("\n***************************************");

		// Testing Example 4 here

		int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumPrefixSum;
		sumPrefixSum = example4(array4);
		System.out.println("Result of the prefix sums of given array Example 4");
		System.out.println(sumPrefixSum);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++");

		// Testing Example 5 here
		int[] firstArray = { 1, 2, 3, 4, 5, 6 };
		int[] secondArray = {1,2,3,4,5,6};

		int prefixArraySum;
		prefixArraySum = example5(firstArray, secondArray);

		System.out.println("Result second array stores sum of prefix sums from first");
		System.out.println(prefixArraySum);
		System.out.println("\n=======================================================");

	}

	/*
	 * Question 2: Give a big-Oh characterization, in terms of n, of the running
	 * time of the example2 method from Exercises class in Lesson 4 example
	 */
	/** Returns the sum of the integers with even index in given array. */
	public static int example2(int[] arr) { // O(1)
		int n = arr.length, total = 0; // O(1)
		for (int j = 0; j < n; j += 2) // note the increment of 2 // O(1)
			total += arr[j];
		return total;

		/*
		 * Explanation: Once Again, we have a (for) loop and it runs (n) times and this
		 * for loop dominates the runtime.So this is linear time and the answer is O(n).
		 * 
		 */
	}

//Question 3:  Give a big-Oh characterization, in terms of n, of the running time of the example3
//method from Exercises class in Lesson 4 example

	/** Returns the sum of the prefix sums of given array. */
	public static int example3(int[] arr) { // O(n)
		int n = arr.length, total = 0; // O(1)
		for (int j = 0; j < n; j++) // loop from 0 to n-1 // O(n^2)
			for (int k = 0; k <= j; k++) // loop from 0 to j
				total += arr[j];
		return total;

		/*
		 * Explanation: Since we have nested for loop which dominates here and it is
		 * O(n^2) and we always take the maximum. so the answer is quadratic time O(n^2)
		 * 
		 */
	}
	/*
	 * Question 4:Give a big-Oh characterization, in terms of n, of the running time
	 * of the example4 method from Exercises class in Lesson 4 examples
	 */

	/** Returns the sum of the prefix sums of given array. */
	public static int example4(int[] arr) { // O(1)
		int n = arr.length, prefix = 0, total = 0; // O(1), O(1), (1)
		for (int j = 0; j < n; j++) { // loop from 0 to n-1 // O(n)
			prefix += arr[j];
			total += prefix;
		}
		return total;

		/*
		 * Explanation: The method contains a (for) loop and it runs (n) times.This loop
		 * dominates the runtime.We always aim for the worse-case and maximum time. The
		 * answer is it is linear time of O(n) notation.
		 * 
		 */
	}

	/*
	 * Question 5: Give a big-Oh characterization, in terms of n, of the running
	 * time of the example5 method from Exercises class in Lesson 4 examples
	 */

	/**
	 * Returns the number of times second array stores sum of prefix sums from
	 * first.
	 */
	public static int example5(int[] first, int[] second) { // assume equal-length arrays
		int n = first.length, count = 0;
		for (int i = 0; i < n; i++) { // loop from 0 to n-1
			int total = 0;
			for (int j = 0; j < n; j++) // loop from 0 to n-1
				for (int k = 0; k <= j; k++) // loop from 0 to j
					total += first[k];
			if (second[i] == total)
				count++;
		}
		return count;
	}
	/*
	 * Explanation: We can see that this method contains three loops, one outside
	 * and two inner(for) loops. The first loop O(n) The second and third loop
	 * result combine with first loop will be O(n^3)
	 * 
	 */

}
