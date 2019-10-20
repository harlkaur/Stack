package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int count = validSubString(str);
			System.out.println(count);
		}
		System.out.println("");
	}

	private static int validSubString(String str) {
		int count = 0;
		int maxCount = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				stack.push(i);
			} else if (ch == ')' && !stack.isEmpty()) {
				stack.pop();
				if (!stack.isEmpty())
					count = (i - stack.peek());
				else
					stack.push(i);
				if (count > (maxCount)) {
					maxCount = count;
				}
			}
		}
		return maxCount;
	}

}
