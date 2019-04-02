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

	public void displayStack() {
		int increment = 0;

	}

	public void hashFunction1(String[] stringsForArray, String[] theArray) {
		for (int n = 0; n < stringsForArray.length; n++) {
			String newElementVal = stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}

}
