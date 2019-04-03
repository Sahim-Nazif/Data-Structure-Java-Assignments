package exercise2;

import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLibary {

	public static void main(String[] args) {

		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put("Java Early Object", 75);
		hashmap.put("Android Programming Book", 44);
		hashmap.put("Asp.Net MVC", 85);
		hashmap.put("Python Book", 55);
		
		//Creating and returning set view
		Set<Map.Entry<String, Integer>> setView=hashmap.entrySet();
		
		//iterate through all the element and print
		for(Map.Entry<String, Integer>em:setView)
		{
		 System.out.print(em.getKey() + " : ");
		 System.out.println(em.getValue());
		}

	}

}
