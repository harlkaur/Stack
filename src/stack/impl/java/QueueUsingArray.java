package stack.impl.java;

public class QueueUsingArray {
	int front;
	int rear;
	int size;
	static int default_capacity=  120;
	int arr[];

	public QueueUsingArray() {
		front = -1;
		rear = -1;
		size = 0;
		arr = new int[default_capacity];
	}

	public QueueUsingArray(int size) {
		front = -1;
		rear = -1;
		this.size = 0;
		arr = new int[size];
	}

	private void enqueue(int element) {
		if (isFull()) {
			System.out.println(" Queue is full, cant insert element ");
		} else if(front == -1 && rear == -1){
			 front ++;
			 arr[front]=element;
			 rear++;
			 ++size;
		}else {
			rear++;
			arr[rear] = element;
			++size;
		}
	}

	private void deque() {
		if (isEmpty()) {
			System.out.println(" Nothign to delete!!! ");
		} else {
			arr[front] = 0;
			front++;
			--size;
		}
	}

	private int front() {
		// same as peek method of stack
		if (isEmpty()) {
			System.out.println(" Nothign to delete!!! ");
			return -1;
		} else {
			return arr[front];
		}
	}

	private boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	private boolean isFull() {
		if (rear == arr.length-1)
			return true;
		else
			return false;
	}

	private void display() {
		if(!isEmpty()) {
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		 }
		System.out.println(" ");
		}else
			System.out.println(" queue is empty !!! ");
	}

	public static void main(String[] args) {
		QueueUsingArray queueUsingArray = new QueueUsingArray();
		queueUsingArray.deque();
		System.out.println(" displaying after insertion ");
		queueUsingArray.display();
		queueUsingArray.enqueue(10);
		queueUsingArray.front();
		queueUsingArray.enqueue(20);
	
		
		System.out.println(" displaying after insertion ");
		queueUsingArray.display();
		System.out.println(" displaying after deletion of one element ");
		queueUsingArray.deque();
		queueUsingArray.display();
		System.out.println(" verifying for empty queue : " + queueUsingArray.isEmpty());
		System.out.println(" verifying if queue is full : " + queueUsingArray.isFull());
		System.out.println(" peeping the front element: " + queueUsingArray.front());
	}

}
