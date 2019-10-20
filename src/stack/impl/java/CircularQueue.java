package stack.impl.java;

public class CircularQueue {

	int front;
	int rear;
	int size;
	int[] arr;
	static int default_capacity = 10;
	int noOfElements;

	public CircularQueue() {
		front = -1;
		rear = -1;
		size = 0;
		noOfElements = 0;
		arr = new int[default_capacity];
	}

	CircularQueue(int size) {
		front = -1;
		rear = -1;
		this.size = 0;
		noOfElements = 0;
		arr = new int[size];
	}

	private void enqueue(int element) {
		if (isFull()) {
			System.out.println(" Queue is full, delete elements to proceed ");
		} else if (front == -1 && rear == -1) {
			front++;
			arr[front] = element;
			rear++;
			noOfElements++;
		} else if(rear==arr.length-1){
			rear=0;
			arr[rear] = element;
			noOfElements++;
		}else {
			rear++;
			arr[rear] = element;
			noOfElements++;
		}
	}

	private void dequeue() {
		if (isEmpty())
			System.out.println(" queue is empty, nothing to remove ");
		else {
			arr[front] = 0;
			front++;
//			size--;
			noOfElements--;
		}
	}

	private boolean isEmpty() {
		return noOfElements == 0;
	}

	private boolean isFull() {
		return noOfElements == arr.length;
	}

	private int front() {
		if (isEmpty()) {
			System.out.println(" queue is empty, nothing to display ");
			return -1;
		} else {
			return arr[front];
		}
	}

	private void display() {
		if (isEmpty()) {
			System.out.println(" queue is empty, nothing to display ");
		} else if(front<rear){
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}else {
			for(int i=front;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			for(int i=0;i<=rear;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		queue.enqueue(14);
		queue.enqueue(22);
		queue.enqueue(13);
		queue.enqueue(-6);
		queue.display();
		System.out.println(" no of elements " + queue.noOfElements);
		queue.dequeue();
		queue.dequeue();
		queue.display();
		System.out.println(" no of elements " + queue.noOfElements);
		queue.enqueue(9);
		queue.enqueue(20);
		queue.enqueue(5);
		queue.display();
		queue.enqueue(100);
		System.out.println(" returning front element: " + queue.front());
		System.out.println(" checking for empty queue: " + queue.isEmpty());
		System.out.println(" checking for full queue: " + queue.isFull());
	}

}
