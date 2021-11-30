package boj_class3;

import java.util.Scanner;

public class Main5525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		int[] dp = new int[s];
		for (int i = 2; i < str.length(); i++) {
			if (str.charAt(i) == 'I' && str.charAt(i - 1) == 'O' && str.charAt(i - 2) == 'I') {
				dp[i] = dp[i - 2] + 1;
			}
			if (dp[i] >= n)
				cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
