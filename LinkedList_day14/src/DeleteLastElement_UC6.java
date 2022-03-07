
public class DeleteLastElement_UC6 {
	    public Node head;
	    public Node tail;
    public static void main(String[] args) {
        DeleteLastElement_UC6 list = new DeleteLastElement_UC6();
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
	        if(head == null) {
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
    public void pop() {										  
    	// Deleting the LastNode with Value
        if(head == null) {										        
        	//Checks if the list is empty
            System.out.println("List is empty");
            return;
        	}
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            	}
            else {
                head = tail = null;
            	}
        	}
    	}
}