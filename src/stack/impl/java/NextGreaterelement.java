package stack.impl.java;

import java.util.Stack;

public class NextGreaterelement {

	public static void main(String[] args) {
		long[] arr = { 1, 3, 2, 4 };
		nextGreater(arr, arr.length);
		System.out.println();
	}

	private static void nextGreater(long[] arr, int n) {
		Stack<Long> stack = new Stack<Long>();
		for (int i = 0; i < n-1; i++) {
			while(i != n-1) {
				if(arr[i+1] > arr[i]) {
					stack.push(arr[i+1]);
				}
				i++;
			}
		}
	}

}
