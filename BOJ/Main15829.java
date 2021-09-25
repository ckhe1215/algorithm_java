package BOJ;

import java.util.Scanner;

public class Main15829 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		String str = scanner.next();
		long sum = 0;
		long r = 1;
		for (int i = 0; i < cnt; i++)
		{
			int num = str.charAt(i) - 'a' + 1;
			sum = (sum + num * r) % 1234567891;
			r = r * 31 % 1234567891;
		}
		System.out.println(sum);
		scanner.close();
	}
}
