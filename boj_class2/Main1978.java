package BOJ;

import java.util.Scanner;

public class Main1978 {

	public static void main(String[] args) {
		
		int[] prime = new int[1001];
		for(int i = 0; i < 1001; i++) {
			prime[i] = i;
		}
		prime[1] = 0;
		for (int i = 2; i < 1001; i++) {
			if (prime[i] == 0) continue;
			for (int j = i + 1; j < 1001; j++) {
				if (prime[j] == 0) continue;
				if (prime[j] % i == 0) prime[j] = 0;
			}
		}
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			if (prime[sc.nextInt()] != 0) cnt++;
		}
		System.out.print(cnt);
	}

}
