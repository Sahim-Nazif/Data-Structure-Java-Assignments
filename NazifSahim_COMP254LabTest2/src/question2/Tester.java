package question2;

public class Tester {

	public static void main(String[] args) {

		Node node = new Node("COMP 254");

		node.insert("COMP 304");
		node.insert("COMP 222");

		System.out.println("Print all the elements");
		node.printPreOrder();
		System.out.println("This is the post order method");
		node.printPostOrder();

	}

}