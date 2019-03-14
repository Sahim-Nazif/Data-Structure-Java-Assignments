package Question3;


public class Runner { 
	
	
public static void main(String[] args) 
{ 
  
	HobbyLinkedlist hobby = new HobbyLinkedlist(); 
   
   hobby.push("Programming"); 
   hobby.push("Movies"); 
   hobby.push("Playing Cricket");

 System.out.println("\nDislay my hobbies");
 System.out.println("\n------------------");
   hobby.display(); 
   hobby.pop(); 
   System.out.println("After pop ");
   hobby.display(); 
 
} 
} 