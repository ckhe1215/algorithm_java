package boj_class3;

import java.util.Scanner;

public class Main1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[1000001];
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		for(int i = 4; i <= n; i++) {
			int b = Integer.MAX_VALUE;
			int c = Integer.MAX_VALUE;
			int a = dp[i - 1] + 1;
			if (i % 2 == 0)
				b = dp[i / 2] + 1;
			if (i % 3 == 0) 
				c = dp[i / 3] + 1;
			dp[i] = Math.min(a, Math.min(b, c));
		}
		System.out.println(dp[n]);
	}

}
