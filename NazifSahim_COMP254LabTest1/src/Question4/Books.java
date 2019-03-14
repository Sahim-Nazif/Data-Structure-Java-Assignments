package Question4;

import java.util.ArrayList;
import java.util.List;

public class Books {

	public static void main(String[] args) {
		
		List<String> favoriteBooks= new ArrayList<String>();
		
		System.out.println("\nList of My favorite Books");
		System.out.println("\n--------------------------");
		
		favoriteBooks.add("The Great Game");
		favoriteBooks.add("In search of the lost time");
		favoriteBooks.add("Programming with Khan");
		favoriteBooks.add("You were called");
		favoriteBooks.add("Arrival to Kenya");
		
		for (String books: favoriteBooks) {
			System.out.println(books);
		}
		
		

	}

}
