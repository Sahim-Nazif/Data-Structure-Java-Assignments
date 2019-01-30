package CirculLinkedList;

public class CircularlyLinkedList<E> {

	private static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;

		}

		public Node<E> getNext() {
			return next;
		}

		public void setSet(Node<E> n) {
			next = n;
		}
	}

	// nested node class
	// instance variables
	private Node<E> tail = null;
	private int size = 0;

	// constructor with empty list
	public CircularlyLinkedList() {

	}

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return tail.getNext().getElement();

	}

	public E las() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// this method will rotate the first element to the back of the list
	public void rotate() {
		if (tail != null)
			tail = tail.getNext();
	}

	// this method will add element e to the front of the list
	public void addFirst(E e) {
		if (size == 0) {
			tail = new Node<>(e, null);
			tail.setSet(tail);
		} else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setSet(newest);

		}
		size++;
	}

	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		Node<E> head = tail.getNext();
		if (head == tail)
			tail = null;
		else
			tail.setSet(head.getNext());
		size--;
		return head.getElement();
	}

	public void print() {
		System.out.print("Circular Linked List:");
		Node temp = tail;
		if (size <= 0) {
			System.out.print("List is empty");
		} else {
			do {
				System.out.print(" " + temp.element);
				temp = temp.next;
			} while (temp != tail);
		}
		System.out.println();
	}

	public CircularlyLinkedList<E> clone() throws CloneNotSupportedException 
	{
		CircularlyLinkedList<E> other = (CircularlyLinkedList<E>) super.clone();
		if (size > 0) {
			other.tail = new Node<>(tail.getElement(), null);
			Node<E> walk = tail.getNext();
			Node<E> otherTail = other.tail;
			while (walk != null) {
				Node<E> newest = new Node<>(walk.getElement(), null);
				otherTail.setSet(newest);
				otherTail = newest;
				walk = walk.getNext();
			}

		}
		return other;
	}

}
