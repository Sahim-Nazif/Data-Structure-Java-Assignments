package exercise1;

public class Tester {

	public static void main(String[] args) {
		
		HashFunction func= new HashFunction(30);
		
		String []elementsToAddStrings= {"1", "5","17","21","26"};
		func.hashFunction1(elementsToAddStrings, func.theArray);
		func.displayStack();

	}

}
