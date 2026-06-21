package datastructures;
public class linkedlist {
    Node head;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    public void insertAtEnd(int data) {
    	if(head==null) {
    		insertAtBeginning(data);
    		return;
    	}
    	Node NewNode= new Node(data);
    	Node temp= head;
    	while(temp.next!= null) {
    		temp=temp.next;
    	}
    	temp.next=NewNode;
    }
    public void deleteAtEnd() {
    	if(head==null) {
    		System.out.println("Empty List");
    		return;
    	}
    	if(head.next==null) {
    		head=null;
    		return;
    	}
    	Node temp=head;
    	while(temp.next.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=null;
    }
    public void insertAtPos(int pos, int data) {
    	if(pos<0) return;
    	if(pos==1) {
    		insertAtBeginning(data);
    		return;
    	}
    	Node newNode=new Node(data);
    	Node temp= head;
    	for(int i=0; i<pos-1 && temp!=null; i++) {
    		temp=temp.next;
    	}
    	if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtPos(int pos) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range.");
            return;
        }
        temp.next = temp.next.next;
    }
    
    public void deletebyValue(int data) {
    	if(head==null) {
    		System.out.println("Empty List");
    		return;
    	}
    	if(head.data==data) {
    		head=head.next;
    		return;
    	}
    	Node temp= head;
    	while(temp.next!=null && temp.next.data!=data) {
    		temp=temp.next;
    	}
    	if(temp.next==null) {
    		System.out.println("Element not found");
    	}
    	temp.next=temp.next.next;
    }
    
    public void updatebyPos(int pos, int data) {
    	if(head==null) {
    		System.out.println("Empty List");
    		return;
    	}
    	if(pos<1) {
    		System.out.println("Invalid Position");
    		return;
    	}
    	Node temp=head;
    	for(int i=1; 1<pos && temp!=null; i++) {
    		temp=temp.next;
    	}
    	if(temp==null) {
    		System.out.println("No position");
    		return;
    	}
    	temp.data=data;
    }
    
    public void updatebyValue(int old, int val) {
    	if(head==null) {
    		System.out.println("Empty list");
    		return;
    	}
    	Node temp=head;
    	while (temp!=null){
    		if(temp.data==old) {
    			temp.data=val;
    			return;
    		}
    		temp=temp.next;
    	}
    	System.out.println("Value not in list");
    }
    public int countNode() {
        Node temp = head;
        int count=0;
        while (temp != null) {
            temp = temp.next;
            count+=1;
        }

        return count;
    }
    public void search(int val) {
    	if(head==null) {
    		System.out.println("Empty List");
    		return;
    	}
    	Node temp=head;
    	int x=0;
    	while(temp!=null) {
    		if(temp.data==val) {
    			System.out.println("Element found at position:"+x);
    			return;
    		}
    		temp=temp.next;
    		x++;
    	}
    	System.out.println("Element not found:"+-1);    	
    }
    public void reverseLinkedList() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
        list.deleteAtBeginning();
        list.display();
        list.insertAtEnd(40);
        list.display();
        list.insertAtEnd(50);
        list.insertAtEnd(70);
        list.display();
        list.deleteAtEnd();
        list.display();
        list.insertAtPos(2, 35);
        list.display();
        list.deletebyValue(35);
        list.display();
        list.updatebyPos(1,25);
        list.display();
        list.updatebyValue(40,60);
        list.display();
        list.countNode();
        list.search(40);
        list.search(60);
        list.reverseLinkedList();
        list.display();
    }
}