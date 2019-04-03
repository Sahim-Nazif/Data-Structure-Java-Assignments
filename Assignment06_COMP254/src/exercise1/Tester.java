package exercise1;

public class Tester {

	public static void main(String[] args) {

		HashFunction func = new HashFunction(30);

		String[] elementsToAdd = { "100", "510", "170", "214", "268", "398", "235", "802", "900", "723", "699", "1",
				"16", "999", "890", "725", "998", "978", "988", "990", "989", "984", "320", "321", "400", "415", "450",
				"50", "660", "624" };
		func.hashFunction2(elementsToAdd, func.theArray);

		func.findKeyString("400");
		func.displayHash();

	}

}
