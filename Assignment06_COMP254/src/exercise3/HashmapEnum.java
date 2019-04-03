package exercise3;

import java.util.HashMap;
import java.util.Map;

public class HashmapEnum {

	enum KeyType {
		Laptop, Tablet, Mobile;

	}

	public static void main(String[] args) {

		Map<KeyType, Integer> dataMap = new HashMap<KeyType, Integer>();
		dataMap.put(KeyType.Laptop, 0);
		dataMap.put(KeyType.Mobile, 1);
		dataMap.put(KeyType.PC, 2);

		for (KeyType key : dataMap.keySet()) {
			System.out.println(key + " -> " + dataMap.get(key));
		}

	}

}
