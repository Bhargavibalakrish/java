package com.example.DSA.StackArray;

public class StackArray {

	int[] stack;
	int size;
	int top;
	
	public StackArray(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	
	void push(int data) {
		
		if(top == size-1) {
			System.out.println("Stack Overflow in push()\n");
			return;
		}
		
		stack[++top] = data;
	}
	
	int pop() {
		if(top== -1) {
			System.out.println("Stack Underflow - empty Stack \n");
			return -1;
		}
		
		//int removed = stack[top];
		//top--;
		return stack[top--];

	}
	
	
	int peek() {
		if(top == -1) {
			System.out.println("Stack Underflow : empty Stack \n");
			return -1;
		}
		
		return stack[top];
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	boolean isFull() {
		return top == size-1;
	}
	
	
	void display() {
		System.out.print("Stack Array : ");
//		for(int i=top;i>=0;i--) {
//			System.out.print(stack[i] + " ");
//		}
		
		for( int i= 0 ;i<=top ;i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
}
