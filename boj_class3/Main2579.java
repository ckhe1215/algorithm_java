package boj_class3;

import java.util.Scanner;

public class Main2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] dp = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			if (i == 0){
				dp[i] = arr[i];
			} else if (i == 1) {
				dp[i] = dp[0] + arr[i];
			} else if (i == 2) {
				dp[i] = Math.max(arr[0], arr[1]) + arr[i];
			}
			else {
				dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
			}
		}
		System.out.println(dp[num - 1]);
		sc.close();
	}

}
