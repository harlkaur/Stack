package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElementGFC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextLong();
			}
			nextLargerElement(arr);
			System.out.println(" ");
		}
	}

	private static void nextLargerElement(long[] arr) {
		Stack<Long> stack = new Stack<Long>();
		long[] result = new long[arr.length];
		stack.push(arr[arr.length - 1]);
		result[0] = -1;
		int k = 1;
		int i = arr.length - 2;
		while (i >= 0) {
			while (!stack.isEmpty()) {
				if ((i >= 0) && stack.peek() > arr[i]) {
					result[k++] = stack.peek();
					stack.push(arr[i]);
					i--;
				} else {
					stack.pop();
				}
			}
			if ((i >= 0)) {
				result[k++] = -1;
				stack.push(arr[i]);
				i--;
			}
		}
		for (int m = result.length - 1; m >= 0; m--) {
			System.out.print(result[m] + " ");
		}
	}

}
