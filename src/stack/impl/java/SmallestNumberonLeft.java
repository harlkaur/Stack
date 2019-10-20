package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberonLeft {
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			smallestNumber(arr);
			System.out.println(" ");
		}
	}

	private static void smallestNumber(int[] arr) {
		int[] result = new int[arr.length];
		result[0] = -1;
		int k = 1;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty()) {
				if ((stack.peek()) < arr[i]) {
					result[k++] = stack.peek();
					break;
				} else
					stack.pop();
			}
			if (stack.isEmpty()) {
				result[k++] = -1;
			}
			stack.push(arr[i]);

		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
