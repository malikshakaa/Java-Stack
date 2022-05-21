public class DoublyLL {
  
   //Define the class Node for DLL, DLL consists of two nodes.
    class Node{    
        int data;   // String, double, ArrayList, List, Array
        Node prev;    
        Node next;    
  
        public Node(int data) {    
            this.data = data;    
        }    
    }    
  
   //Define the head and the tail nodes on the DLL
    Node head = null;  
    Node tail = null;    
      
    public void insertToBegin(int data) {    
               
            Node myNode = new Node(data);    
            // if the DLL is empty then the node will the head and the tail at the same time
            // Tail next is null and head previous is null as it is th only node in the list. 
            if(head == null)   
            {   
            	
                head = myNode;  
                tail = myNode;  
                //null <---- head.previous       tail.next ----> null
                head.prev = null;    
                tail.next = null;    
            }    
            // if the DLL is not empty, we connect the newNode with head (head.previous points to newNode)
            // newNode.previous points to null, newNode.next points to the head. Then head will become the newNode.
            else {    
            	// myNode ----- head ---- tail
            	// myNode <----- head.previous             myNode.next ---> head        
                head.prev = myNode;    
                myNode.next = head;    
                myNode.prev = null;    
                head = myNode;  //   
            }    
    }  
      
    //display the content of DLL   
    public void showData() {  
        Node current = head;    
        if(head == null) {  
            System.out.println("Doubly Linked List is empty");    
         }  
        else 
        {
        	System.out.println("Doubly Linked List consists of the following Nodes: ");    
        	while(current != null) {    
        		System.out.print(current.data + "\n");    
        		current = current.next;    
        	    }    
        }    
   }
    public static void main(String[] args) {    
  
        DoublyLL dll = new DoublyLL();    
  
        //Adding nodes into the doubly linked list   
        dll.insertToBegin(100);    
        dll.insertToBegin(200);    
        dll.insertToBegin(300);    
        dll.insertToBegin(400);    
        dll.insertToBegin(500);    
        dll.insertToBegin(600);    
        dll.insertToBegin(700);    
        dll.insertToBegin(800);    
        dll.insertToBegin(900);   
        
    
        dll.showData();    
    }    
}  