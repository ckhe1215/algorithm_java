package BOJ;

import java.util.Scanner;

public class Main1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = num / 5 + num / 25 + num / 125;
		System.out.println(ans);
	}

}
