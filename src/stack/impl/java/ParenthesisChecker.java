package stack.impl.java;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			parenthesisChecker(str);
		}
		System.out.println("");
	}

	private static void parenthesisChecker(String str) {
		Stack<Character> stack = new Stack<Character>();
		if (str.length() % 2 != 0) {
			System.out.println("not balanced");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
				stack.pop();
			} else if (!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
				stack.pop();
			} else
				stack.push(ch);
		}
		if (stack.isEmpty())
			System.out.println("balanced");
		else
			System.out.println("not balanced");
	}

}
