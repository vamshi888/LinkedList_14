
public class SimpleLinkedList_UC1 {
	  Node head;
	public static void main(String[] args) {
        SimpleLinkedList_UC1 linkedList = new SimpleLinkedList_UC1();
        	linkedList.head = new Node(56);
        Node second = new Node(30);
        Node Third = new Node(70);
	        linkedList.head.next = second;
	        second.next = Third;  
        while (linkedList.head != null) {									
        	// Print the Data with Values
            System.out.println(linkedList.head.data);
            	linkedList.head = linkedList.head.next;
        }
    }
	static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }   
} 
