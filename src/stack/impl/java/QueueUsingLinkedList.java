package stack.impl.java;

public class QueueUsingLinkedList {

	NodeQueue front;
	NodeQueue rear;

	private void enqueue(int element) {
		NodeQueue temp = new NodeQueue(element);
		if (front == null) {
			front = temp;
			rear = front;
		} else {
			rear.setNext(temp);
			rear = temp;
		}

	}

	private int dequeue() {
		if (isEmpty()) {
			System.out.println(" empty queue, nothing to delete ");
			return -1;
		} else {
			int data = front.getData();
			front = front.getNext();
			if(front==null)
				rear = null;
			return data;
		}
		
		
	}

	private int front() {
		if (isEmpty()) {
			System.out.println(" empty queue, nothing to delete ");
			return -1;
		} else {
			return front.getData();
		}
	}

	private boolean isEmpty() {
		return (front == null && rear == null) ? true : false;

	}

	private void display() {
		if (isEmpty()) {
			System.out.println(" empty queue, nothing to display ");
		} else {
			NodeQueue curr = front;
			while (curr != rear) {
				System.out.print(curr.getData() + " ");
				curr = curr.getNext();
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.display();
		queue.dequeue();
		queue.display();
	}

}

class NodeQueue {
	int data;
	NodeQueue next;

	NodeQueue() {

	}

	NodeQueue(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeQueue getNext() {
		return next;
	}

	public void setNext(NodeQueue next) {
		this.next = next;
	}

}