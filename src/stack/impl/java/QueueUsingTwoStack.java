package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {

	public static void main(String[] args) {
		StackQueue g = new StackQueue();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int q = sc.nextInt();
			while (q-- > 0) {
				int queryType = sc.nextInt();
				if (queryType == 1) {
					int a = sc.nextInt();
					g.insert(a);
				} else if (queryType == 2) {
					System.out.println(g.remove() + " ");
				}
				System.out.println(" ");
			}
		}
	}

}

class StackQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	void insert(int data) {
		stack1.push(data);
	}

	int remove() {
		int data;
		if (!stack2.isEmpty()) {
			data = stack2.peek();
			stack2.pop();
		} else {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.peek());
				stack1.pop();
			}
			if (stack2.isEmpty()) {
				data = -1;
			} else {

				data = stack2.peek();
				stack2.pop();
			}
		}
		return data;
	}
}
