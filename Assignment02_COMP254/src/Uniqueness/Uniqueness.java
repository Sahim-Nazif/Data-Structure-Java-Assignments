package Uniqueness;

import java.util.Arrays;

public class Uniqueness {

	public static boolean unique1(int[] data, int n) {
		
		for (int j = 0; j < n - 1; j++)
			for (int k = j + 1; k < n; k++)
				if (data[j] == data[k])
					return false; 
		return true; 
	}

	
	public static boolean unique2(int[] data, int n) {
		
		int[] temp = Arrays.copyOf(data, n); 
		Arrays.sort(temp);
		for (int j = 0; j < n - 1; j++)
			if (temp[j] == temp[j + 1]) 
				return false;
		return true; 
	}

	public static void main(String[] args) {
	//the code is only for testing the biggest value of n. Not for the uniqueness of the
		//array elements.
		long startTime, endTime,totalTime;
		int [] a= {10,12,14,15,16};
		
		boolean b;
		b=unique1(a,2);
		System.out.println(b);
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
		System.out.println(" value of n in unique1 is :" + i);
			
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
		System.out.println(" value of n in unique 2 is :" + i);

	}

}
