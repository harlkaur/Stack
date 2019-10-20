package stack.impl.java;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String str = "{([]}";
		System.out.println(ispar(str));
	}

	static boolean ispar(String x) {
		boolean result = false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')') {
				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
			} else if (ch == '}') {
				if (!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					return false;
			} else if (ch == ']') {
				if (!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return false;
			}
		}
		if (stack.isEmpty())
			result = true;
		return result;
	}
}
