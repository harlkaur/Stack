package stack.impl.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			reverseWords(str);
		}
		System.out.println("");
	}

	private static void reverseWords(String str) {
		String[] s = str.split("\\.");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length; i++) {
			stack.push(s[i]);

		}
		while (stack.size() != 1) {
			System.out.print(stack.peek() + ".");
			stack.pop();
		}
		System.out.println(stack.peek());

	}
}
