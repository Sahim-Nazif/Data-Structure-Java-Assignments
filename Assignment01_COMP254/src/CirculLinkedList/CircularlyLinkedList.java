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
			//nested node class
			//instance variables
			private Node<E> tail=null;
			private int size=0;
			
			//constructor with empty list
			public CircularlyLinkedList( ) 
			{
				
			}
			public int size() {
				return size;
				
			}
			public boolean isEmpty() {
				return size==0;
			}
			public E first() {
				if (isEmpty())
					return null;
				return tail.getNext().getElement();
				
			}
		}
	
