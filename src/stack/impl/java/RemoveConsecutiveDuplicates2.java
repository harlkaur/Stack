package stack.impl.java;

import java.util.Stack;

public class RemoveConsecutiveDuplicates2 {

	public static void main(String[] args) {
		String str = "aabb";
		System.out.println(removeConsecutiveDuplicates(str));
	}

	private static String removeConsecutiveDuplicates(String str) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(str.charAt(0));
        for(int i = 1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!stack.isEmpty() && (ch == stack.peek())) {
            	stack.pop();
            	//i++;
            }else
                stack.push(ch);
        }
        StringBuffer s = new StringBuffer();
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        return s.reverse().toString();
    }

}
