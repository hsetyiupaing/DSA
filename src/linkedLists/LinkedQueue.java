package linkedLists;

import java.util.Scanner;

public class LinkedQueue {
	Node front;
	Node rear;
	Scanner s;
	LinkedQueue(){
		this.front = null;
		this.rear = null;
		this.s = new Scanner(System.in);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue queue = new LinkedQueue();
		queue.menu();
		
	}
	 public void menu() {
	        while (true) {
	            System.out.println("\n--- Queue Menu ---");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
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
	                case 1 -> insert();
	                case 2 -> delete();
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
	 
	private void insert() {
		/* Pushing the element into stack
		 * Create a temporary variable
		 * assign data part
		 * If there are no elements, assign temp in both front and rear
		 * If so, assign temp in link part of rear
		 * assign temp in rear
		 */
		System.out.println("Enter an Element to insert: ");
		int data = s.nextInt();
		Node temp = new Node(data);
		if(rear == null) {
			front = temp;
			rear = temp;
		}else {
			rear.link = temp;
			rear = temp;
		}
	}
	
	private void delete() {
		/* Check the queue is empty
		 * assign front.link in front
		 * if front == null, rear == null
		 */
		if(front == null) {
			System.err.println("Queue Empty. No Elements to delete. ");
		}else {
			System.out.println("The Deleted Element is " + front.data);
			front = front.link;
			if(front == null) rear = null;
		}
	}
	private void display() {
		/*Check if the Queue is empty
		 * IF yes, display error message
		 * IF no, create a temp variable
		 * display temp.data
		 * LOOP WHILE temp != null
		 */
		if(front == null) {
			System.err.println("Queue Empty! Nothing to display");
		}else {
			Node temp = front;
			
			System.out.println("The Elements in the Queue are:");
			while(temp != null) {
				System.out.println(temp.data + "\t");
				temp = temp.link;
				
			}
		}
	}
}
