package Exercise01;



public class LinkedQueue<E> implements Queue<E> {

	  /** The primary storage for elements of the queue */
	  private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty  list

	  /** Constructs an initially empty queue. */
	  public LinkedQueue() { }                  // new queue relies on the initially empty list

	  /**
	   * Returns the number of elements in the queue.
	   * @return number of elements in the queue
	   */
	  @Override
	  public int size() { return list.size(); }

	  /**
	   * Tests whether the queue is empty.
	   * @return true if the queue is empty, false otherwise
	   */
	  @Override
	  public boolean isEmpty() { return list.isEmpty(); }

	  /**
	   * Inserts an element at the rear of the queue.
	   * @param element  the element to be inserted
	   */
	  @Override
	  public void enqueue(E element) { list.addLast(element); }

	  /**
	   * Returns, but does not remove, the first element of the queue.
	   * @return the first element of the queue (or null if empty)
	   */
	  @Override
	  public E first() { return list.first(); }

	  /**
	   * Removes and returns the first element of the queue.
	   * @return element removed (or null if empty)
	   */
	  @Override
	  public E dequeue() { return list.removeFirst(); }

	  /** Produces a string representation of the contents of the queue.
	   *  (from front to back). This exists for debugging purposes only.
	   */
	  public String toString() {
	    return list.toString();
	  }
	  //the method to merge the two lists
	  public void concatenate(LinkedQueue<E> Q2)
	  {
		  while(Q2.isEmpty()!=true) {
			  this.enqueue(Q2.dequeue());
		  }
		  
	  }
	  
	  
	  public static void main(String args[]) {
		  
		  LinkedQueue<String> Q1 = new LinkedQueue<String>();
		  Q1.enqueue("hi");
		  Q1.enqueue("hello");
		  System.out.println(Q1);
		  LinkedQueue<String> Q2 = new LinkedQueue<String>();
		  Q2.enqueue("Good Day");
		  Q2.enqueue("Good morning");
		  System.out.println(Q2);
		  Q1.concatenate(Q2);
		  System.out.println("Q1: "+Q1);
		  System.out.println("Q2: "+Q2);
		  Q2.concatenate(Q1);
		  System.out.println(Q2);
		  
	  }
	}