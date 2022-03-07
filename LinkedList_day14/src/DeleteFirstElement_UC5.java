
public class DeleteFirstElement_UC5{
	    public Node head;
	    public Node tail;
    public static void main(String[] args) {
        DeleteFirstElement_UC5 list = new DeleteFirstElement_UC5();
	        list.add(70);
	        list.add(30);
	        list.add(56);
	        list.display();
	        list.pop();
	        list.display();
		}     
    static class Node {
        int data;
        Node next;
		    Node(int d) {
		        data = d;
		        next = null;
		    	}
    	} 
    public void add(int datas){										
    	// Adding new Node with values
        Node newNode = new Node(datas);
	        if(head == null){
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            newNode.next = head;
	            head = newNode;
	        }
    	}
    public void display() {										   
    	// Display the Node with value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public void pop(){											   
    	// Deleting the FirstNode with Value
        Node current = head;
        if(current == head){
            head = head.next;
            current = head;
        }
    } 
}