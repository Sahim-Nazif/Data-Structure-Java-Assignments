package SignlyLinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		//inserting values into the nodes
		//5--6--7--8--9--10--11--12--13--14
		
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.insert(11);
		list.insert(12);
		list.insert(13);
		list.insert(14);
		
		//calling the show method 
		System.out.println("**********************************");
		System.out.println("\nDisplaying the data in the nodes");
		list.show();
		System.out.println();
		System.out.println("\nlets swap numbers ((10--11--12--14)");
		System.out.println();
		list.swapNodes(11, 10);
		list.show();
		System.out.println();
		list.swapNodes(14, 12);
		//list.show();
	}

}
