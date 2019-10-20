package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class countTheReversals {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			String str = sc.next();
			printReversal(str);
			System.out.println(" ");
		}
	}

	private static void printReversal(String str) {

		char[] ch = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		double count1 = 0, count2 = 0;
		int reversalCount = 0;
		if (ch.length % 2 != 0) {
			reversalCount = -1;
			System.out.print(reversalCount);
			return;
		} else {
			for (int i = 0; i < ch.length; i++) {
				if ((!stack.isEmpty()) && (stack.peek() == '{') && ch[i] == '}') {
					stack.pop();
				} else if ((!stack.isEmpty()) && stack.peek() == '{' && ch[i] == '{') {
					stack.push(ch[i]);
				} else if ((!stack.isEmpty()) && stack.peek() == '}' && ch[i] == '}') {
					stack.push(ch[i]);
				} else
					stack.push(ch[i]);
			}

			while (!stack.isEmpty()) {
				if (stack.peek() == '{') {
					count1++;
				} else
					count2++;
				stack.pop();
			}

		}
		reversalCount = (int) (Math.ceil(count1 / 2) + Math.ceil(count2 / 2));
		System.out.print(reversalCount);
	}
}
