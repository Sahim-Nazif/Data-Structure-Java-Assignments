package CirculLinkedList;

public class RunnerCircularly {
	

	public static void main(String[] args) throws CloneNotSupportedException {

		CircularlyLinkedList<String> list = new CircularlyLinkedList<String>();

		
		list.addFirst("Nazif");
		list.print();
		list.addLast("Sahim");
		

		list.print();
		list.rotate();
		list.size();
		list.clone();
	}

}
