package datastructures;

public class circularlinkedlist {
Node head;
public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        newNode.next = head;
        return;
    }
    Node temp = head;
    while (temp.next != head) {
        temp = temp.next;
    }

    newNode.next = head;
    temp.next = newNode;
    head = newNode;
}
public void insertAtEnd(int data) {
	Node newNode  =new Node(data);
	if(head==null) insertAtBeginning(data);
	Node temp=head;
	while(temp.next!=head) temp=temp.next;
	if(temp.next==head) {
		temp.next=newNode;
		newNode.next=head;
	}
	
}
public void deleteAtBeginning() {
	if(head==null) System.out.println("List is Empty");
	Node temp=head;
	while(temp.next!=head) {
		temp=temp.next;
	}
	if(temp.next==head) {
		temp.next=head.next;
		return;
	}
}
public void display() {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    do {
        System.out.print(temp.data + "-->");
        temp = temp.next;
    } while (temp != head);

    System.out.println("(head)");
}

public static void main(String[] args) {
	circularlinkedlist list = new circularlinkedlist();
	list.insertAtBeginning(40);
	list.insertAtBeginning(30);
	list.insertAtBeginning(20);
	list.insertAtBeginning(10);
	list.display();
	list.insertAtEnd(50);
	list.display();
	list.insertAtBeginning(5);
	list.display();
	list.insertAtEnd(60);
	list.insertAtEnd(70);
	list.display();
	list.deleteAtBeginning();
	list.display();
}
}
