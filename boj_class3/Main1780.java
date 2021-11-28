package boj_class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780 {

	static int zero = 0;
	static int minus = 0;
	static int plus = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		check(arr, 0, num, 0, num);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
		br.close();
	}
	
	static void check(int[][] arr, int start, int end, int start2, int end2) {
		int num = arr[start][start2];
		boolean flag = true;
		if (end == start) return;
		for (int i = start; i < end; i++) {
			for (int j = start2; j < end2; j++) {
				if (arr[i][j] != num) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			if (num == 0)
				zero++;
			else if (num == 1)
				plus++;
			else
				minus++;
		} else {
			int range = (end - start) / 3;
			int range2 = (end2 - start2) / 3;
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					check(arr, start + a * range, start + (a + 1) * range,
							start2 + b * range2, start2 + (b + 1) * range2);
				}
			}
		}
		
	}

}
