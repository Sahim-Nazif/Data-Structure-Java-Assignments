package Question1;


public class LinkedList {
	Node head;
	
	public void insert(String data) {
		Node node= new Node();
		node.data=data;
		node.next=null;
		
		if (head==null) {
			head=node;
		}
		else {
			Node n=head;
			while (n.next !=null) {
				n=n.next;
				
			}
			n.next=node;
		}
		
	}
	public void show() {
		Node node=head;
		
		while(node.next!=null) {
			System.out.println(node.data +"  ");
			node=node.next;
			
		}
		System.out.println(node.data);
	}
 
	void deleteNode(String key) 
    { 
        
        Node temp = head, prev = null; 
  
        
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; 
            return; 
        } 
  
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
       
        if (temp == null) return; 
  
      
        prev.next = temp.next; 
    } 
	
}
