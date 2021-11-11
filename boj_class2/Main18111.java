package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main18111 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int min = Integer.MAX_VALUE;
		int max = -1;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.valueOf(st2.nextToken());
				if (min > arr[i][j]) min = arr[i][j];
				if (max < arr[i][j]) max = arr[i][j];
			}
		}
		int time = Integer.MAX_VALUE;
		int height = 0;
		for (int a = min; a <= max; a++) {
			int temp = check(a, b, arr, n, m);
			if (temp < time) {
				time = temp;
				height = a;
			} else if (temp == time) {
				if (a > height) height = a;
			}
		}
		System.out.print(time + " " + height);
	}
	
	private static int check(int a, int inv, int[][] arr, int n, int m) {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a < arr[i][j]) {
					temp += (arr[i][j] - a) * 2;
					inv += arr[i][j] - a;
				} else if (a > arr[i][j]) {
					temp += a - arr[i][j];
					inv -= a - arr[i][j];
				}
			}
		}
		if (inv < 0)
			return Integer.MAX_VALUE;
		return temp;
	}
}
