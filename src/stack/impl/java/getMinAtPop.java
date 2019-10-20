package stack.impl.java;

import java.util.Stack;

public class getMinAtPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Stack<Integer> push(int arr[], int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int min = arr[0];
		stack.push(min);
		for (int i = 1; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			stack.push(min);
		}
		return stack;

	}

	/*
	 * print minimum element of the stack each time after popping
	 */
	static void _getMinAtPop(Stack<Integer> s) {

		while (!s.isEmpty()) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
		
	}
}
