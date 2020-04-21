package algorithms;

public class SinglyLinkedList {
	
	
	class Node{
		
	 public	int data;
     public Node next;
     
     
     
	public void displayNodeData() {
	 System.out.println("{"+ data +"}");	
	}
     
   
}
	

	private Node head;
	
	public boolean isEmpty() {
		
		return (head == null);
	}
	
	// insert element at start of linkedlist
	
	
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.next = head;
		head = newNode;
    }
	
	
	// insert element at last 
	public void insertLast(int data) {
		
		Node current = head;
		
		while(current.next != null) {
			
			current = current.next;
			
		}
		
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
	}
	
	
   public void printlinkedList() {
	   
	   System.out.println("printing linked list:");
	   
	   Node  current  =  head;
	   
	   while(current != null) {
		   
		   current.displayNodeData();
		   current = current.next;
		   
	   }
	   
	   System.out.println("");
   }	
	
	
	public static void main(String[] args) {
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insertFirst(7);
		singlyLinkedList.insertFirst(5);
		singlyLinkedList.insertFirst(9);
		
		singlyLinkedList.insertLast(2);
		singlyLinkedList.printlinkedList();
		
		
	}
	

}
