package stack.impl.java;

import java.util.Scanner;

public class SearchMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] matrix = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			int target = sc.nextInt();
			searchMatrix(matrix, target, N, M);
		}
	}

	private static void searchMatrix(int[][] M, int target, int row, int column) {
		int j = column - 1;
		int i = 0;
		while (i < row && j >= 0) {
			if (M[i][j] > target) {
				j--;
			} else if (M[i][j] < target) {
				i++;
			} else if (M[i][j] == target) {
				System.out.println("1");
				return;
			}
		}
		System.out.println("0");

	}

}
