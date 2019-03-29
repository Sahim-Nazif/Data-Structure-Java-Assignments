package Exercise2;

public class Tester {

	public static void main(String[] args) {
    	MinInHeap minInHeap= new MinInHeap();
    	System.out.println("\nAdding elements to the Min Priority Queue Array");
    	System.out.println("-----------------------------------------------");
    	minInHeap.add(10);
    	minInHeap.add(15);
		minInHeap.add(20);
		minInHeap.add(17);
		
		minInHeap.printPriorityQueue();
		System.out.println("Checking for the poll () function");
		System.out.println("---------------------------------");
		minInHeap.poll();
		minInHeap.printPriorityQueue();
		System.out.println("\nRemoving an element at the end of the tree");
		System.out.println("-------------------------------------------");
		minInHeap.remove();
		minInHeap.printPriorityQueue();
		
		

		
	}

}
