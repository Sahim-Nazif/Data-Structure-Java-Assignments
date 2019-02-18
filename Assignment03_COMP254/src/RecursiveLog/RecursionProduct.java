package RecursiveLog;

public class RecursionProduct {
	

	public static void main(String[] args) 
	{
		
   /*calling the recursive method to get the product of two integers 
    * without using the multiplication (*)
    */
		System.out.println(multiply(4,2));
		
	}
  //declaring a static method with two arguments
	public static int multiply(int m, int n) {
		//checking the values of m & n
		if (m==0 || n==0) 
			return 0;
		else
			return (m+multiply(m, n-1));
			
		
	}
}
