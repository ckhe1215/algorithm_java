package boj_class2;

import java.util.Scanner;

public class Main11050 {

	static int fac(int num) {
		if (num <= 1)
			return 1;
		return (num * fac(num - 1));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int ans = fac(n) / (fac(k) * fac(n - k));
		System.out.print(ans);
		scanner.close();
	}

}
