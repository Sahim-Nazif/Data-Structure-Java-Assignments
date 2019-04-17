package question1;

import java.util.PriorityQueue;

public class PQQuestion {

	public static void main(String[] args) {
		
		PriorityQueue<String> favoriteSport= new PriorityQueue<String>();
		favoriteSport.add("football");
		favoriteSport.offer("handball");
		favoriteSport.add("cricket");
		favoriteSport.offer("soccer");
		favoriteSport.add("swimming");
		
		
		System.out.println("Dislaying all the elements of the priority queue");
		System.out.println("\n-----------------------------------------------");
		while (! favoriteSport.isEmpty()) {
			System.out.print(favoriteSport.poll() + "  ");
		}
		System.out.println("\n");
		
		favoriteSport.add("football");
		favoriteSport.offer("handball");
		favoriteSport.add("cricket");
		favoriteSport.offer("soccer");
		favoriteSport.add("swimming");
		
		System.out.println("Removed top element from the priority queue");
		System.out.println("-------------------------------------------");
		
		System.out.println("Removed : " + favoriteSport.remove());
		
		
		System.out.println("Displaying the remaining elements");
		System.out.println("*********************************");
		
		while (! favoriteSport.isEmpty()) {
			System.out.print(favoriteSport.poll() + "  ");
		}
		System.out.println("\n");
		
		 System.out.println("Head : " + favoriteSport.peek());
		 
		 favoriteSport.add("football");
			favoriteSport.offer("handball");
			favoriteSport.add("cricket");
			favoriteSport.offer("soccer");
			favoriteSport.add("swimming");
		 
		 System.out.println(favoriteSport.remove("swimming"));
		 
			System.out.println("Removed the least favorite sport from the list");
			System.out.println("\n--------------------------------------------");
			while (! favoriteSport.isEmpty()) {
				System.out.print(favoriteSport.poll() + "  ");
			}
			System.out.println("\n");
			System.out.println("\n");
		 
		

	}

}
