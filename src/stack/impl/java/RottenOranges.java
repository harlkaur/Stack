package stack.impl.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class RottenOranges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConcurrentHashMap<Integer, Pair> map1 = new ConcurrentHashMap<Integer, Pair>();
		ConcurrentHashMap<Integer, Pair> map2 = new ConcurrentHashMap<Integer, Pair>();
		int row = sc.nextInt();
		int column = sc.nextInt();
		int count = 0;
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] == 2) {
					map1.put(++count, new Pair(i, j));
				}
			}
		}
		int result = rottonOranges(matrix, map1, map2, count);
		System.out.println(result);
	}

	private static int rottonOranges(int[][] matrix, ConcurrentHashMap<Integer, Pair> map1,
			ConcurrentHashMap<Integer, Pair> map2, int count) {
		// done with inserting values in matrix and inserting rotten values into map1
		int units = 0;
		int row = matrix.length;
		int column = matrix[0].length;
		if (map1.isEmpty()) {
//			System.out.println("-1");
			return -1;
		}

		// iterating map1 to get 1's and making it 2, putting into map2;
		while (!map1.isEmpty()) {
			Iterator<Entry<Integer, Pair>> iter = map1.entrySet().iterator();
			map2 = new ConcurrentHashMap<Integer, Pair>();
			while (iter.hasNext()) {
				Entry<Integer, Pair> entry = iter.next();
				Pair p = entry.getValue();
				if (p.i - 1 >= 0 && matrix[p.i - 1][p.j] == 1) {
					matrix[p.i - 1][p.j] = 2;
					map2.put(++count, new Pair(p.i - 1, p.j));
				}
				if (p.j - 1 >= 0 && matrix[p.i][p.j - 1] == 1) {
					matrix[p.i][p.j - 1] = 2;
					map2.put(++count, new Pair(p.i, p.j - 1));
				}
				if (p.i + 1 < row && matrix[p.i + 1][p.j] == 1) {
					matrix[p.i + 1][p.j] = 2;
					map2.put(++count, new Pair(p.i + 1, p.j));
				}
				if (p.j + 1 < column && matrix[p.i][p.j + 1] == 1) {
					matrix[p.i][p.j + 1] = 2;
					map2.put(++count, new Pair(p.i, p.j + 1));
				}
			}

			map1.clear();
			map1 = map2;
			if (!map1.isEmpty())
				++units;
			// System.out.println(units+ "===================================");
//
//			Iterator<Entry<Integer, Pair>> iter1 = map1.entrySet().iterator();
//			while (iter1.hasNext()) {
//				Entry<Integer, Pair> entry = iter1.next();
//				System.out.println("key 2 " + entry.getKey() + " Value: " + entry.getValue());
//			}

		}
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] == 1) {
					return -1;
				}
			}
		}
		return units;
	}
}

class Pair {
	int i;
	int j;

	Pair(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Pair [i=" + i + ", j=" + j + "]";
	}

}