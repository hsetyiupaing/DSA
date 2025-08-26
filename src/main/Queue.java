package main;

import java.util.Scanner;

public class Queue {
	Scanner s;
	int myQueue[] ;
	int rear;
	int front;
	Queue(){
		this.s = new Scanner(System.in);
		this.myQueue = new int[6];
		this.rear = -1;
		this.front = -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main menu
		int choice;
		Queue queue = new Queue();
		do {
			System.out.println("Queue Operations");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exist");
			System.out.println("Choose Your Operation: ");
			
			choice = queue.readChoice();
			switch(choice) {
				case 1: queue.insert();break;
				case 2: queue.adjustedDelete();break;
				case 3: queue.display();break;
				case 4: System.out.println("Bye!");break;
				default: System.err.println("Invalid Operation, Try Again!");break;
			}
			
		}while(choice != 4);		
	}
	
	int readChoice() {
		// TODO Auto-generated method stub
		return s.nextInt();
	}
	
	void insert() {
		//To insert an element
		if(rear == 5) {
			System.err.println("Queue Overflowed, Cannot Insert an Element!");
		}else {
			System.out.println("Input an Element to Insert: ");
			rear++;
			myQueue[rear] = s.nextInt();
		}
	}
	
	void delete() {
		// To delete an element
		if(rear == front) {
			System.err.println("Queue Underflowed, No Element to Delete!");
		}else {
			front ++;
			System.out.println("Deleted Element is: " + myQueue[front]);
		}
	}
	
	void adjustedDelete() {
		// To delete an element
		if(rear == front) {
			System.err.println("Queue Underflowed, No Element to Delete!");
		}else {
			System.out.println("Deleted Element is: " + myQueue[0]);
			for(int i = 1; i <= rear; i++) {
				myQueue[i-1] = myQueue[i];
			}
			rear --;
		}
	}
	
	void display() {
		// To display an element
		if(rear == front) {
			System.err.println("Queue Empty, Nothing to Display!");
		}else {
			System.out.println("The elements in the queue are: ");
			for(int i = front+1; i <= rear; i++) {
				System.out.println(myQueue[i]);
			}
		}
	}

}
