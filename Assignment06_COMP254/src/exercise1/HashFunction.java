package exercise1;

import java.util.Arrays;

//based on professor's instruction this assignment was implemented from an online resource

public class HashFunction {
	// creating array with size and elements in the array
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;

	// creating a constructor

	public HashFunction(int size) {
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");

	}

	public void hashFunction1(String[] stringsForArray, String[] theArray) {
		for (int n = 0; n < stringsForArray.length; n++) {
			String newElementVal = stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}
	public void hashFunction2(String[] stringsForArray, String[] theArray) {
		for (int n = 0; n < stringsForArray.length; n++) {
			String newElementVal = stringsForArray[n];
			int arrayIndex=Integer.parseInt(newElementVal)%29;
			System.out.println("Moduls Index= " + arrayIndex + " for value " + newElementVal);
			while (theArray[arrayIndex] !="-1") {
				++arrayIndex;
				System.out.println("Collision Try  " + arrayIndex + " Instead");
				arrayIndex%=arraySize;
								
			}
			theArray[arrayIndex]=newElementVal;
			
			
		}
	}
	
// print the element
	public void displayHash() {

		int increment = 0;

		for (int m = 0; m < 3; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)

				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)

				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (theArray[n].equals("-1"))

					System.out.print("|      ");

				else

					System.out.print(String.format("| %3s " + " ", theArray[n]));
			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)

				System.out.print("-");

			System.out.println();

		}

	}
	//find an element stored in the array
	public String findKeyString (String key) {
		//find the keys original hash key
		int arrayIndexHash=Integer.parseInt(key)%29;
		while (theArray[arrayIndexHash]!="-1") {
			if (theArray[arrayIndexHash]==key) {
				//found the key so return it 
				System.out.println(key + " was found in index " + arrayIndexHash);
				return theArray[arrayIndexHash];
			}
			//look in the next index
			++arrayIndexHash;
			//if we get to the end of the array go back to index 0
			arrayIndexHash %=arraySize;
		}
		//coundn't locate they key
		return null;
	}
}
