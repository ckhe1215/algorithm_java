package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10989 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.valueOf(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(arr);
		for (int i : arr) {
			sb.append(i + "\n");
		}
		System.out.print(sb);
	}

}
