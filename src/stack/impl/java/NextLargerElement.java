package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {

	public static void main(String[] args) {
		int t=0;
		Scanner sc = new Scanner(System.in);
		try {
			t = sc.nextInt();
		}catch(Exception e) {
			System.out.println(" -1");
		}
		while (t-- != 0) {
			int n =0;
			try {
				 n = sc.nextInt();
			}catch(Exception e) {
				System.out.println(" -1");
				break;
			}
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			nextLargerElement(arr);
			System.out.println(" ");
		}
	}

	private static void nextLargerElement(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[arr.length];
		stack.push(arr[arr.length-1]);
		result[0] = -1;
		int k = 1;
//		for (int i = arr.length - 2; i >= 0; i--) {
//			if ((!stack.isEmpty()) && (stack.peek() > arr[i])) {
//				result[k++] = stack.peek();
//				stack.push(arr[i]);
//				// pop all those elements which are lesser that stack.peek while iterating
//				// through bottom of stack. if not present print -1;
//			} while (!stack.isEmpty() && stack.peek() < arr[i]) {
//				stack.pop();
//			} 
//			result[k++] = -1;
//			else if (stack.isEmpty()) {
//					result[k++] = -1;
//			}
//			} else {
//				// print the element which is greater than stack.peek in the array.
//				stack.push(arr[i]);
//			}
//		}
		int count =0;
		int i=arr.length-2;/*i>=0;i--) {*/
		while(i>=0) {
			while(!stack.isEmpty()) {
				if((i>=0) && stack.peek() > arr[i]) {
					result[k++] = stack.peek();
					stack.push(arr[i]);
					i--;
//					continue;
				}else {
					stack.pop();
//					i--;
				}
			}
			if ((i >= 0)) {
				result[k++] = -1;
				stack.push(arr[i]);
				i--;
			}
		}
//			count++;
//		}
			
		for (int m = result.length - 1; m >= 0; m--) {
			System.out.print(result[m] + " ");
		}
	}

}
