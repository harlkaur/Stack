package stack.impl.java;

import java.util.Stack;

public class ReverseAStringUsingStack {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		reverseString(str);
	}

	private static void reverseString(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
		System.out.println(" ");
	}
}
