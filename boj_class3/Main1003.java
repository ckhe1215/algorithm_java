package BOJ;

import java.util.Scanner;

public class Main1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		int[] ans0 = new int[41];
		int[] ans1 = new int[41];
		ans0[0] = 1;
		ans0[1] = 0;
		ans1[0] = 0;
		ans1[1] = 1;
		for (int i = 2; i <= 40; i++) {
			ans0[i] = ans0[i - 1] + ans0[i - 2];
			ans1[i] = ans1[i - 1] + ans1[i - 2];
		}
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			sb.append(ans0[n] + " " + ans1[n] + "\n");
		}
		System.out.print(sb);
		sc.close();
	}

}
