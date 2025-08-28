package linkedLists;

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
	                    System.out.println("Bye!");
	                    System.exit(0);
	                    return;
	                }
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	 
	private void push() {
		/* Pushing the element into stack
		 * Create a temporary variable
		 * assign data part
		 * assign link part of top in link part of temp
		 * assign temp in top
		 */
		System.out.println("Enter an Element to Push: ");
		int data = s.nextInt();
		Node temp = new Node(data);
		temp.link = top;
		top = temp;
	}
	
	private void pop() {
		/* Check the queue is empty
		 * IF yes, display error message
		 * IF no, assign top.link in top
		 */
		if(top == null) {
			System.err.println("Stack Empty. No Elements to delete. ");
		}else {
			System.out.println("The Deleted Element is " + top.data);
			top = top.link;
		}
	}
	private void display() {
		/*Check if the Stack is empty
		 * IF yes, display error message
		 * IF no, create a temp variable
		 * display temp.data
		 * LOOP the process until temp == null
		 */
		if(top == null) {
			System.err.println("Stack Empty! Nothing to display");
		}else {
			Node temp = top;
			
			System.out.println("The Elements in the Queue are:");
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.link;
				
			}
		}
	}
}
