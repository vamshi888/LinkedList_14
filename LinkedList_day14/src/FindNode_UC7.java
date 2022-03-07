
public class FindNode_UC7 {
	    public Node head;
	    public Node tail;
    public static void main(String[] args) {
        FindNode_UC7 FindNode_UC7 = new FindNode_UC7();
	        FindNode_UC7.add(56);
	        FindNode_UC7.add(30);
	        FindNode_UC7.add(70);   
        int Searchelement = 100;
        int ans = FindNode_UC7.search(Searchelement);
    if (ans == -1) {
        System.out.println("Element not found in the Linked List");
    	}
	    else
	        System.out.println("Element found in the Linked List at "+ans);
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
    public int search(int element) {				  
    	// Search the Element
        if (head == null) {
            return -1;
        	}
        int index = 0;
        Node temp = head;
    while (temp != null) {
        if (temp.data == element) {
            return index;
        	}
        index++;
        temp = temp.next;
    	}
    	return -1;
    }
}