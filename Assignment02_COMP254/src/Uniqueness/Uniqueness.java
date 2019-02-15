package Uniqueness;

import java.util.Arrays;

public class Uniqueness {

	public static boolean unique1(int[] data, int n) {
		
		for (int j = 0; j < n - 1; j++)
			for (int k = j + 1; k < n; k++)
				if (data[j] == data[k])
					return false; // found duplicate pair
		return true; // if we reach this, elements are unique
	}

	/** Returns true if there are no duplicate elements in the array. */
	public static boolean unique2(int[] data, int n) {
		
		int[] temp = Arrays.copyOf(data, n); // make copy of data
		Arrays.sort(temp); // and sort the copy
		for (int j = 0; j < n - 1; j++)
			if (temp[j] == temp[j + 1]) // check neighboring entries
				return false; // found duplicate pair
		return true; // if we reach this, elements are unique
	}

	public static void main(String[] args) {
		
		long startTime, endTime,totalTime;
		//checking the time
		int amountArray=(int)Math.pow(2, 20);
		int data[]=new int [amountArray];
		
		int i;
		for (i=0; i<amountArray; i++) {
			data[i]=amountArray-i+1;
			
			
		}
		
		i=1;
		totalTime=0;
		
		while(totalTime/Math.pow(10, 6)<1) 
		{
			startTime=System.nanoTime();
			unique1(data,i);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			i++;
		}
		System.out.println("n in unique1 is :" + i);
			
	

	}

}
