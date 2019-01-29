package SignlyLinkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	public void show() {
		Node node = head;

		while (node.next != null) {
			
			System.out.print(node.data + "  ");
			node = node.next;

		}
		System.out.print(node.data);
	}

	public void swapNodes(int a, int b) {
		// Nothing to do if (a)  and (b) are same
		if (a == b)
			return;

		// Search for (a) (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != a) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for (b) (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != b) {
			prevY = currY;
			currY = currY.next;
		}

		// If either (a) or (b) is not present,no action will be taken
		if (currX == null || currY == null)
			return;

		// If (a) is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else // make (b) the new head
			head = currY;

		// If (b) is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make (a) the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

}