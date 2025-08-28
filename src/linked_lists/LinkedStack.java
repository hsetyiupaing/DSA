package linked_lists;

import java.util.Scanner;

public class LinkedStack {
	Node top;
	Scanner s;
	LinkedStack(){
		this.top = null;
		this.s = new Scanner(System.in);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack stack = new LinkedStack();
		stack.menu();
		
	}
	 public void menu() {
	        while (true) {
	            System.out.println("\n--- Stack Menu ---");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            if (!s.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a number between 1 and 4.");
	                s.next(); // discard invalid input
	                continue;
	            }

	            int choice = s.nextInt();
	            switch (choice) {
	                case 1 -> push();
	                case 2 -> pop();
	                case 3 -> display();
	                case 4 -> {
	                    System.out.println("Exiting program.");
	                    System.exit(0);
	                    return;
	                }
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	 
	void push() {
		System.out.println("Enter an Element to Push: ");
		int data = s.nextInt();
		Node temp = new Node(data);
		temp.link = top;
		top = temp;
	}
	
	void pop() {
		if(top == null) {
			System.err.println("Stack Empty. No Elements to delete. ");
		}else {
			System.out.println("The Deleted Element is " + top.data);
			top = top.link;
		}
	}
	void display() {
		if(top == null) {
			System.err.println("Stack Empty! Nothing to display");
		}else {
			Node temp = top;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.link;
				
			}
		}
	}
}
