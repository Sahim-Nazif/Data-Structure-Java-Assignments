package question2;

public class Node {

	//this class has pointers to left and right nodes
	Node left, right;
	//data to insert
	String data;
	//constructor
public Node(String data) {
	this.data=data;
	
}
//this method will insert value to the node

public void insert(String value) {
	//first check if value is less than data (root)
	//if (value<=data) {
		//first check if left is null, then left will be our new Node
		if(left==null) {
			left=new Node(value);
			
		}else {
			left.insert(value);
		}
}
public void printPreOrder() {
	
	System.out.println(data);
	if (left!=null) {
		left.printPreOrder();
	}
	if (right !=null) {
		right.printPreOrder();
	}
}

public void printPostOrder() {
	if (left!=null) {
		left.printPostOrder();
	}
	if (right !=null) {
		right.printPostOrder();
	}
	System.out.println(data);
}

}