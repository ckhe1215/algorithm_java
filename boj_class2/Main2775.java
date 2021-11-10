package BOJ;

import java.util.Scanner;

public class Main2775 {

	public static void main(String[] args) {
		int[][] apt = new int[15][15];
		for (int i = 0; i < 15; i++) {
			apt[0][i] = i;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				for (int k = 1; k <= j; k++) {
					apt[i][j] += apt[i - 1][k];
				}
			}
		}
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0)
		{
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			System.out.println(apt[k][n]);
		}
		scanner.close();
	}

}
