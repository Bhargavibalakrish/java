package com.example.DSA.StackArray;

public class StackMain {

	public static void main(String[] args) {
		StackArray s = new StackArray(5);
		System.out.println("Is Empty stack : " + s.isEmpty() + "\n");
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		System.out.println("Is Stack Full : " + s.isFull() + "\n");
	
		System.out.println("Removed element is : "+ s.pop() + "\n");
		s.display();
		
		System.out.println("Top element is : " + s.peek() + "\n");
		s.display();
		
		System.out.println("Is Empty stack : " + s.isEmpty() + "\n");
		System.out.println("Is Stack Full : " + s.isFull() + "\n");
		s.push(80);
		s.display();
	}

}
