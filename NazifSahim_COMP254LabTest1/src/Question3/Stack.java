package Question3;

class HobbyLinkedlist { 


 private class Node { 

     String data; 
     Node link; 
 } 

 Node top; 

public HobbyLinkedlist() 
 { 
     this.top = null; 
 } 


 public void push(String hobby) 
 { 
    
     Node temp = new Node(); 

     temp.data = hobby; 
 
     temp.link = top; 
     top = temp; 
 } 


 
 public void pop() 
 { 
     
     if (top == null) { 
         System.out.print("\nNo data"); 
         return; 
     } 

       top = (top).link; 
 } 

 public void display() 
 { 
  
     if (top == null) { 
         System.out.printf("\nNo data"); 
       
     } 
     else { 
         Node temp = top; 
         while (temp != null) { 

           System.out.println(temp.data); 

            
             temp = temp.link; 
         } 
     } 
 } 
} 
