package Exercise1;

public class NodeClass {

	Node head;  
	  
	
	public void addAtTheEnd(Node node)  
	{ 
	    if (head == null) 
	    { 
	        head = node; 
	    } 
	    else 
	    { 
	        Node temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    } 
	} 
	  
	
	public void display() 
	{ 
	    Node temp = head; 
	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	    System.out.println(); 
	} 
	  
	  

	public static void main(String args[]) 
	{ 
	   
		//creating objects of the NodeClass
		NodeClass listA = new NodeClass(); 
		NodeClass listB = new NodeClass(); 
	      
	    
		listA .addAtTheEnd(new Node(5)); 
		listA .addAtTheEnd(new Node(10)); 
		listA .addAtTheEnd(new Node(15)); 
		 listA.display();  
	    
		listB .addAtTheEnd(new Node(2)); 
		listB .addAtTheEnd(new Node(3)); 
		listB .addAtTheEnd(new Node(20)); 
		
		 listB.display();
	    System.out.println("\nConcatnation Result of the List A to List B");
	    System.out.println("\n-------------------------------------------");
		listA.head = new Stack().Concatenate(listA.head, listB.head); 
	    listA.display();      
	      
	} 
	} 