package Question1;

public class Tester {

	public static void main(String[] args) {
	LinkedList list= new LinkedList();
		
		list.insert("Nazif");
		list.insert("Abdul");
		list.insert("Ahnaf");
		list.insert("Waris");
		
		System.out.println("List of the group members");
		System.out.println("-------------------------");
		
		list.show();
		System.out.println("\nAfter removal element from the head of the list");
		System.out.println("-----------------------------------------------");
		list.deleteNode("Nazif");
		
		list.show();
	
	}

}
