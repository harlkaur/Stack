package stack.impl.java;

public class LinkedStack {

	Node top;

	private void push(int data) {
		Node temp = new Node(data);
		temp.setData(data);
		temp.setNext(top);
		top = temp;
	}

	private void pop() {
		if (top == null)
			System.out.println(" Nothing to pop ");
		else {
			top = top.getNext();
		}
	}

	private boolean isEmpty() {
		return top == null;
	}

	private int peek() {
		if (top == null) {
			System.out.println(" empty list");
			return -1;
		} else
			return top.getData();
	}

	private void display() {
		if (top == null)
			System.out.println(" empty list");
		else {
			Node curr = top;
			while (curr != null) {
				System.out.print(curr.getData() + " ");
				curr = curr.getNext();
			}
			System.out.println(" ");
		}
	}

	private void clear() {
		top = null;
	}

	public static void main(String[] args) {
		LinkedStack linkedStack = new LinkedStack();
		linkedStack.push(10);
		linkedStack.push(20);
		System.out.println(" Displaying the list after pushing ");
		linkedStack.display();
		linkedStack.pop();
		System.out.println(" Displaying the list after popping ");
		linkedStack.display();
		linkedStack.clear();
		System.out.println(" Displaying the list after clearing ");
		linkedStack.display();
		System.out.println(" verifying if the list isEmpty ");
		System.out.println(linkedStack.isEmpty());
		linkedStack.pop();
		System.out.println(" Displaying the list after popping ");
		linkedStack.display();
		linkedStack.push(30);
		linkedStack.push(40);
		linkedStack.push(50);
		System.out.println(" Peeking element  ");
		System.out.println(linkedStack.peek());
	}

}

class Node {

	private int data;
	private Node next;

	Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}