package CirculLinkedList;

public class RunnerCircularly {

	public static void main(String[] args) {
		
		CircularlyLinkedList<String> list= new CircularlyLinkedList<String>();
		
		//list.show();
		list.addFirst("Nazif");
		list.show();
		list.addLast("Sahim");
	
		list.show();
		list.rotate();
		

	}

}
