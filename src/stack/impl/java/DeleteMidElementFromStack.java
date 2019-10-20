package stack.impl.java;

import java.util.Stack;

public class DeleteMidElementFromStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		Stack<Integer> result = deleteMid(stack, stack.size(), 0);
		while(!result.isEmpty()) {
			System.out.print(result.pop() + " ");
		}
	}

	public static Stack<Integer> deleteMid(Stack<Integer> s, int sizeOfStack, int current) {
		int[] arr = new int[sizeOfStack-1];
		Stack<Integer> result = new Stack<Integer>();
		int k = 0;
		int top = sizeOfStack-1;
		System.out.println(sizeOfStack/2);
		if(sizeOfStack%2 == 0) {
			while(top != -1) {
				if(top != ((sizeOfStack/2)-1)) {
//					result.push(s.pop());
					arr[k++]  = s.pop();
				}else {
					s.pop();
				}
				top--;
			}
		}else {
			while(top != -1) {
				if(top != ((sizeOfStack/2))) {
//					result.push(s.pop());
					arr[k++] = s.pop();
				}else {
					s.pop();
				}
				top--;
			}
		}
		for(int m = arr.length-1;m>=0;m--) {
			result.push(arr[m]);
		}
		return result;
	}

}
