package boj_class2;

import java.util.Scanner;

public class Main1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int start = sc.nextInt();
		int end =sc.nextInt();
		int[] arr = new int[end + 1];
		for (int i = 0; i <= end; i++) {
			arr[i] = i;
		}
		arr[1] = 0;
		for (int i = 2; i <= Math.sqrt(end); i++) {
			if (arr[i] != 0) {
				for (int j = i * i; j <= end; j++) {
					if (j % i == 0)
						arr[j] = 0;
				}
			}
		}
		for (int i = start; i <= end; i++) {
			if (arr[i] != 0)
				sb.append(i + "\n");
		}
		System.out.print(sb);
	}

}
