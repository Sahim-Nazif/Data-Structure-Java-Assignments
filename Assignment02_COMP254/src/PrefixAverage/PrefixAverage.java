package PrefixAverage;

/*  Student Name: Nazif Sahim
Student ID: 300886750
Description: Assignment 2
Course: COMP254
Instructor: Reza Dibaj
Date: 14 Feb 2019
------------------------------
*/
class PrefixAverage {

	/**
	 * Returns an array a such that, for all j, a[j] equals the average of x[0],
	 * ..., x[j].
	 */
	public static double[] prefixAverage1(double[] x) {
		int n = x.length;
		double[] a = new double[n]; // filled with zeros by default
		for (int j = 0; j < n; j++) {
			double total = 0; // begin computing x[0] + ... + x[j]
			for (int i = 0; i <= j; i++)
				total += x[i];
			a[j] = total / (j + 1); // record the average
		}
		return a;
	}

	/**
	 * Returns an array a such that, for all j, a[j] equals the average of x[0],
	 * ..., x[j].
	 */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n]; // filled with zeros by default
		double total = 0; // compute prefix sum as x[0] + x[1] + ...
		for (int j = 0; j < n; j++) {
			total += x[j]; // update prefix sum to include x[j]
			a[j] = total / (j + 1); // compute average based on current sum
		}
		return a;
	}

	

	public static void main(String[] args) {
	
		long start, end, run;
		double [] x=new double[10000];
		start=System.currentTimeMillis();
		prefixAverage2(x);
		end=System.currentTimeMillis();
		run=end-start;
		System.out.println(run);
		

	}
}
