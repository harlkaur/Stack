package stack.impl.java;

import java.util.Scanner;

public class CelebrityProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int N = sc.nextInt();
			int M[][] = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					M[i][j] = sc.nextInt();
				}
			}
			int id = celebrityProblem(M);
			System.out.println(id);
		}
	}

	private static int celebrityProblem(int[][] m) {
		int row = m.length;
		int column = m.length;
		int sum = 0;
		int[] arr = new int[row];
		for(int j=0;j<column;j++) {
			arr[j] = m[0][j];
		}
		
		for(int j=0;j<column;j++) {
			sum=sum+arr[j];
		}
		if(sum==0) {
			// do something
		}else {
			for(int j=0;j<column;j++) {
				arr[j] = m[0][j];
			}
		}
		return 0;
	}

}
