package datastructures;

public class stack {
	int size;
	int top;
	int[] arr;
public stack(int size) {

	this.size=size;
	arr=new int[size];
	top=-1;
}
public void push(int data) {
	if(top==size-1) {
		System.out.println("Stack full");
		return;
	}
	top++;
	arr[top]=data;
}
public int pop() {
	if(top==-1) {
		System.out.println("Empty Stack"); 
	}
	int value= arr[top];
	top--;
	return value;
}
public void peek() {
	if(top==-1) System.out.println("Stack is empty");
	else System.out.println("Top element:"+arr[top]);
}
public boolean isEmpty() {
	return(top==-1);
}
public boolean isFull() {
	return(top==size-1);
}
public void display() {
	if(top==-1) System.out.println("Stack is empty");
	else for(int i=top; i>=0; i--) System.out.print(arr[i]+" ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack sk=new stack(10);
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.push(40);
		sk.push(50);
		sk.push(60);
		sk.push(70);
		sk.push(80);
		sk.push(90);
		sk.push(100);
		sk.push(101);
		sk.display();
		System.out.println(sk.pop());
		sk.display();
		sk.peek();
		System.out.println(sk.isEmpty());
		System.out.println(sk.isFull());
		

	}

}
