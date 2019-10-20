package stack.impl.java;

import java.util.Stack;

public class removeConsecutiveDuplicates {

	public static void main(String[] args) {
		String str = "aaabbcc";
		System.out.println(removeConsecutiveDuplicates(str));
	}
	
	 public static String removeConsecutiveDuplicates(String str){
	        Stack<Character> stack = new Stack<Character>();
	        stack.push(str.charAt(0));
	        for(int i = 1; i<str.length(); i++){
	            char ch = str.charAt(i);
	            if(ch != str.charAt(i-1))
	                stack.push(ch);
	        }
	        StringBuffer s = new StringBuffer();
	        while(!stack.isEmpty()){
	            s.append(stack.pop());
	        }
	        return s.reverse().toString();
	    }

}
