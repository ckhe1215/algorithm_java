package BOJ;

import java.util.Scanner;

public class Main17626 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] memo = new int[n + 1];
		memo[1] = 1;
		for (int i = 2; i <= n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, memo[i - j * j]);
			}
			memo[i] = min + 1;
		}
		System.out.println(memo[n]);
	}

}
