package main;

import java.util.Scanner;

public class Stack {
	Scanner s;
	int myStack[] ;
	int top;
	Stack(){
		this.s = new Scanner(System.in);
		this.myStack = new int[6];
		this.top = -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main menu
		int choice;
		Stack stack = new Stack();
		do {
			System.out.println("Stach Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exist");
			System.out.println("Choose Your Operation: ");
			
			choice = stack.readChoice();
			switch(choice) {
				case 1: stack.push();break;
				case 2: stack.pop();break;
				case 3: stack.display();break;
				case 4: System.out.println("Bye!");break;
				default: System.err.println("Invalid Operation, Try Again!");break;
			}
			
		}while(choice != 4);		
	}
	
	int readChoice() {
		// TODO Auto-generated method stub
		return s.nextInt();
	}
	
	void push() {
		//To insert an element
		if(top == 5) {
			System.err.println("Stack Overflowed, Cannot Push an Element!");
		}else {
			System.out.println("Input an Element to push: ");
			top++;
			myStack[top] = s.nextInt();
		}
	}
	
	void pop() {
		// To delete an element
		if(top == -1) {
			System.err.println("Stack Underflowed, No Element to Pop!");
		}else {
			System.out.println("Poped Element is: " + myStack[top]);
			top --;
		}
	}
	
	void display() {
		// To display an element
		if(top == -1) {
			System.err.println("Stack Empty, Nothing to Display!");
		}else {
			System.out.println("The elements in the stack are: ");
			for(int i = top; i >= 0; i--) {
				System.out.println(myStack[i]);
			}
		}
	}
}
