package stack.impl.java;

import java.util.Stack;

public class Stockspanproblem {

	public static void main(String[] args) {
		int[] arr = { 10,4,5,90,120,80 };
		int s[] = new int[arr.length];
		calculateSpan(arr, arr.length, s);
	}

	private static void calculateSpan(int[] price, int n, int[] S) {
		boolean flag = false;
		Stack<Integer> stack = new Stack<Integer>();
		int k = 1;
		int top = 0;
		stack.push(price[0]);
		S[0] = 1;
		for(int i =1;i<price.length;i++) {
			if(price[i] < price[i-1]) {
				stack.push(price[i]);
				S[k++] = 1;
				top++;
			}else {
				while(top != -1) {
					if(price[top] > price[i]) {
						S[k++]  = i - top;
						flag = true;
						break;
					}
					top--;
				}
				if(!flag) {
					S[k++] = i+1;
				}
				top = i;
				flag = false;
			}
		}
		for (int i = 0; i < S.length; i++) {
			System.out.print(S[i] + " ");
		}
	}

//	public static void calculateSpan(int price[], int n, int S[]) {
//		Stack<Integer> stack = new Stack<Integer>();
//		int k = 1;
//		int top = -1;
//		stack.push(price[0]);
//		S[0] = 1;
//		for (int i = 1; i < price.length; i++) {
//			if (price[i] < price[i - 1]) {
//				while (top != -1) {
//					if (price[i] < price[i - 1]) {
//						top--;
//					} else {
//						S[k++] = i - top;
//					}
//				}
//				stack.push(price[i]);
//				S[k++] = 1;
//			} else {
//				while (top != -1) {
//					if (price[i] < price[i - 1]) {
//						top--;
//					} else {
//						S[k++] = i - top;
//					}
//				}
//				S[k++] = 2;
//				stack.push(price[i]);
//			}
//		}
//		for (int i = 0; i < S.length; i++) {
//			System.out.print(S[i] + " ");
//		}
//	}

}
