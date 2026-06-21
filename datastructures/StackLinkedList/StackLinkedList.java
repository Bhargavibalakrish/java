package com.example.DSA.StackLinkedList;

public class StackLinkedList {

	Node top;
	
	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	
	int pop() {
		if(top == null) {
			System.out.println("Empty List/Stack");
			return -1;
		}
		
		int value = top.data;
		top = top.next;
		return value;
	}
	
	int peek() {
		if(top == null) {
			System.out.println("Empty List/Stack");
			return -1;
		}
		
		return top.data;
	}
	
	boolean isEmpty() {
		return top==null;
	}
	
	void display() {
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data + "--> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		System.out.println("Stack / List empty : " + s.isEmpty());
		System.out.println("pop value = " + s.pop());
		System.out.println("peek value = " + s.peek());
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println("pop value = " + s.pop());
		s.display();
		System.out.println("peek value = " + s.peek());
		s.display();
		System.out.println("Stack / List empty : " + s.isEmpty());

	}

}
