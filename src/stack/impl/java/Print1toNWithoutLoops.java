package stack.impl.java;

import java.util.Scanner;

public class Print1toNWithoutLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			printNumbers(n);
			System.out.println();
		}
	}

	private static void printNumbers(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		} else {
			printNumbers(n - 1);
			System.out.print(n + " ");
		}
	}

}
