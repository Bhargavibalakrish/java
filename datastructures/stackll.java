package datastructures;

public class stackll {
Node top=null;
void push(int value) {
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
    System.out.println(value + " pushed into stack");
}
void display() {
    if (top == null) {
        System.out.println("Stack is empty");
    } else {
        System.out.println("Stack elements:");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

boolean isEmpty() {
	return(top==null);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
