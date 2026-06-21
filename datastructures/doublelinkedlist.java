package datastructures;

public class doublelinkedlist {
	Node head;
	public void insertAtBeginning(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
	public void displayForward() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " --> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
	}
	public void displayBackward() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    while (temp != null) {
	        System.out.print(temp.data + " <-- ");
	        temp = temp.prev;
	    }
	    System.out.println("null");
	}	
	public void insertAtEnd(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			insertAtBeginning(val);
			return;
		}
		Node temp=head;
		while(temp.next!=null) temp=temp.next;
		temp.next=newNode;
		newNode.prev=temp;
	}
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("List at empty");
			return;
		}
		head=head.next;
		head.prev=null;
	}
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp=head;
		while(temp.next.next!=null) temp=temp.next;
		temp.next=null;
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
    public void insertAtPosition(int val, int pos) {

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        // Move to the node before the required position
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublelinkedlist list= new doublelinkedlist();
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);
		list.displayForward();
		list.displayBackward();
		list.insertAtEnd(60);
		list.displayForward();
		list.deleteAtBeginning();
		list.displayForward();
		list.deleteAtEnd();
		list.displayForward();
		list.displayBackward();
		list.insertAtPosition(25, 3);
		list.displayForward();
		System.out.println("Count of Nodes:"+list.countNode());
	}

}
