package main;

import java.util.Scanner;

public class CircularQueue {
	Scanner s;
	int myQueue[] ;
	int rear;
	int front;
	CircularQueue(){
		this.s = new Scanner(System.in);
		this.myQueue = new int[6];
		this.rear = 0;
		this.front = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main menu
		int choice;
		CircularQueue queue = new CircularQueue();
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
				case 2: queue.delete();break;
				case 3: queue.display();break;
				case 4: System.out.println("Bye!");System.exit(0);break;
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
		if((rear + 1)%6 == front) {
			System.err.println("Queue Overflowed, Cannot Insert an Element!");
		}else {
			rear= (rear + 1) % 6;
			System.out.println("Input an Element to Insert: ");
			myQueue[rear] = s.nextInt();
		}
	}
	
	void delete() {
		// To delete an element
		if(rear == front) {
			System.err.println("Queue Underflowed, No Element to Delete!");
		}else {
			front = (front + 1)%6;
			System.out.println("Deleted Element is: " + myQueue[front]);
		}
	}
	
	void display() {
		// To display an element
		if(rear == front) {
			System.err.println("Queue Empty, Nothing to Display!");
		}else {
			for(int i = (front + 1%6); i != (rear + 1 %6); i++) {
				System.out.println(myQueue[i]);
			}
		}
	}

}
