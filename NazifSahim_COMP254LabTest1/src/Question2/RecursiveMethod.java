package Question2;

public class RecursiveMethod {
	
		
	public static void main(String[] args) {
		
		System.out.println("\n--------------------------------------------");
		int x=4, n=2;
		System.out.println("\nThe product of two positive Integers " + (x) + " & "  +(n) + " is");
		System.out.println();
		System.out.println(MyPower(x,n));
		
		
	}
  //declaring a static method with two arguments
	public static int MyPower(int x, int n) {
		//checking the values of m & n
		
		if (x==0 || n==0) 
			return 0;
		else
			
			//both ways are possible
			return (x+MyPower(x, n-1));
		     
		   //return m+=multiply(m,n-1);
			
		
	}
}
