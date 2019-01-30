package CirculLinkedList;

public class RunnerCircularly {
	

	public static void main(String[] args) throws CloneNotSupportedException {

		CircularlyLinkedList<String> list = new CircularlyLinkedList<String>();
		System.out.println("\n----------------------");
		System.out.println("Added at first");
		list.addFirst("Nazif");
		list.print();
		System.out.println("\n----------------------");
		System.out.println("Added at last");
		list.addLast("Sahim");
		

		list.print();
		list.rotate();
		list.size();
		System.out.println("\n----------------------");
		System.out.println("Clone result");
		list.clone();
		list.print();
		
	}

}
