package question2;

public class BinarySearchTree {
	public class Node {
		String key;
		Node left,right;
		
		public Node (String item) {
			key=item;
			left=right=null;
			
			
		}
	}
	//root of binary search tree
	Node root;
	//constructor
	public BinarySearchTree() {
		root=null;
	}
 public void insert (String key) {
	 root=insertRec(root, key);
	 
 }
 //A recursive function to insert a new key in binary search tree
 Node insertRec(Node root, String key) {
	 //if the tree is empty, return a new node
	 if (root==null) {
		 root= new Node(key);
		 return root;
	 }
	 //otherwise, recur down the tree
	// if (key<root.key)
		 root.left=insertRec(root.left, key);
	// else if (key>root.key)
		// root.right=insertRec(root.right, key);
	 //return the (unchanged) node pointer
	 return root;
 }
 //this method calls inorderRec
 public void inorder( ) {
	 inorderRec(root);
	 
 }
 public void inorderRec(Node root) {
	 if (root !=null) {
		 inorderRec(root.left);
		 System.out.println(root.key);
		 inorderRec(root.right);
		 
	 }
 }

	public static void main(String[] args) {
	
		BinarySearchTree binarySearchTree= new BinarySearchTree();
		binarySearchTree.insert("COMP 254");
		binarySearchTree.insert("COMP 304");
		
		binarySearchTree.inorder();

	}

}
