package CirculLinkedList;

public class RunnerCircularly {

	public static void main(String[] args) {

		CircularlyLinkedList<String> list = new CircularlyLinkedList<String>();

		// list.show();
		list.addFirst("Nazif");
		list.print();
		list.addLast("Sahim");

		list.print();
		list.rotate();

	}

}
