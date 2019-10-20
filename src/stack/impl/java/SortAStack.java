package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class SortAStack {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			Stack<Integer> stack1 = new Stack<Integer>();
			for (int i = 0; i < n; ++i) {
				stack1.push(sc.nextInt());
			}
			Stack<Integer> result = sortAStack(stack1);
			while (!result.isEmpty()) {
				System.out.print(result.peek() + " ");
				result.pop();
			}
			System.out.println();
		}
	}

	private static Stack<Integer> sortAStack(Stack<Integer> s) {
		int size = s.size();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> result = new Stack<Integer>();

		while (!s.isEmpty()) {
			stack1.push(s.peek());
			s.pop();
		}

		int min = 0;
		while (!(result.size() == size)) {
			min = stack1.peek();
			while (!stack1.isEmpty()) {
				if (stack1.peek() < min) {
					min = stack1.peek();
				} else {
					stack2.push(stack1.peek());
					stack1.pop();
				}
			}

			while (!stack2.isEmpty()) {
				if (stack2.peek() == min) {
					result.push(stack2.peek());
					stack2.pop();
				} else {
					stack1.push(stack2.peek());
					stack2.pop();
				}
			}

		}

		return result;

	}

}