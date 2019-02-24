package RecursiveLog;

public class RecursionProduct {
	

	public static void main(String[] args) 
	{
		
   /*calling the recursive method to get the product of two integers 
    * without using the multiplication (*)
    */
		System.out.println("\n--------------------------------------------");
		int m=4, n=2;
		System.out.println("\nThe product of two positive Integers " + (m) + " & "  +(n) + " is");
		System.out.println();
		System.out.println(multiply(m,n));
		
		
	}
  //declaring a static method with two arguments
	public static int multiply(int m, int n) {
		//checking the values of m & n
		if (m==0 || n==0) 
			return 0;
		else
			
			//both ways are possible
			return (m+multiply(m, n-1));
		     
		   //return m+=multiply(m,n-1);
			
		
	}
}
