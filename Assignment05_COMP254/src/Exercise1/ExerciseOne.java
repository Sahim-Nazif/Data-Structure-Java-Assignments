package Exercise1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExerciseOne {

	public static void main(String[] args)
	{
	   //Creating empty priority queue with String type
		PriorityQueue<String> pQueue=new PriorityQueue<String>();
		
		//adding items to the queue using add()
		pQueue.add("Java");
		pQueue.add("Csharp");
		pQueue.add("Python");
		pQueue.add("Asp.Net Core MVC2");
		pQueue.add("JavaScript");
		
		//Printing the most with most priority by using peek();
		//It will return Asp.net, because it starts with A
		System.out.println("\nHead value using peek function " + pQueue.peek());
		System.out.println("------------------------------");
		
		//printing all the elements using Iterator with while loop
		
		System.out.println("The queue elements are : ");
		System.out.println("-------------------------");
		
		Iterator<String> iterator=pQueue.iterator();
		while (iterator.hasNext()) 
			System.out.println(iterator.next());
		
		// Removing the top priority element (or head) and 
        // printing the modified pQueue using poll() 
		//it will remove Asp.net. Again because it has A and top priority
		pQueue.poll();
		System.out.println("\nAfter removing an element with poll function");
		
		Iterator<String> iterator2=pQueue.iterator();
		while (iterator2.hasNext())
			System.out.println(iterator2.next());
		
		//let remove Java using built in remove () method
		pQueue.remove("Java");
		System.out.println("\nAfter removing Java with remove function : ");
		
		Iterator<String >iterator3=pQueue.iterator();
		while (iterator3.hasNext())
			System.out.println(iterator3.next());
		
		//check if an element is present using contains () method
		boolean b=pQueue.contains("Csharp");
		System.out.println("Priority queue contains Csharp or not ? " + b);
		
		//Getting objects from the queue using toArray() method
		//in an array  and print the array 
		
		Object []array=pQueue.toArray();
		System.out.println("Value in array : ");
		for (int i=0; i<array.length; i++)
			System.out.println("Value : " + array[i].toString());
	
		
   
	}

}
