package stack.impl.java;

public class ArrayStack {
	int top;
	int size;
	int[] arr;

	public ArrayStack(int size) {
		this.top = -1;
		this.size = size;
		this.arr = new int[size];
	}

	private void push(int data) {
		if (isFull())
			System.out.println(" No space for insertion of elements ");
		else {
			top++;
			arr[top] = data;
		}
	}

	private void pop() {
		if (isEmpty())
			System.out.println(" Empty array, nothing to pop ");
		else {
			arr[top] = 0;
			top--;
		}
	}

	private int peek() {
		if (isEmpty()) {
			System.out.println(" Empty array, nothing to peek ");
			return -1;
		} else {
			return arr[top];
		}
	}

	private boolean isFull() {
		return top == arr.length - 1;
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private void clear() {
		for (int i = top; i >= 0; i--) {
			arr[i] = 0;
		}
		top = -1;
	}

	private void display() {
		if (isEmpty())
			System.out.println(" Empty array, nothing to display !!! ");
		else {
			for (int i = top; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		ArrayStack arrayStack = new ArrayStack(5);
		arrayStack.push(10);
		System.out.println(" displaying the array ");
		arrayStack.display();
		arrayStack.push(20);
		arrayStack.push(30);
		arrayStack.push(40);
		arrayStack.push(50);
		System.out.println(" displaying the array ");
		arrayStack.display();
		System.out.println(" peeping element : " + arrayStack.peek());
		System.out.println(" verifying for full : " + arrayStack.isFull());
		System.out.println(" verifying for empty : " + arrayStack.isEmpty());
		arrayStack.pop();
		System.out.println(" displaying the array after popping ");
		arrayStack.display();
		arrayStack.clear();
		System.out.println(" displaying the array after clearing ");
		arrayStack.display();
		System.out.println(" verifying if empty : " + arrayStack.isEmpty());
		System.out.println(" verifying for full : " + arrayStack.isFull());
	}
}
