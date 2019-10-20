package stack.impl.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingKElementsOfQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		int k = 3;
		Queue<Integer> result = modifyQueue(q,k);
	}

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> result = new LinkedList<>();
		for(int i=0;i<k;i++) {
			stack.push(q.peek());
			q.poll();
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.peek() + " ");
			stack.pop();
		}
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.poll();
		}
		return result;
    }
}
