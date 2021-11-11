package boj_class2;

import java.util.Scanner;

public class Main2231 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			int sum = 0;
			int tmp = i;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			if (sum + i == num) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		scanner.close();
	}

}
