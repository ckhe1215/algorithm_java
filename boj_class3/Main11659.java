package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] arr = new int[n + 1];
		arr[1] = Integer.parseInt(st2.nextToken());
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st2.nextToken());
		}
		for (int i = 0; i < m; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st3.nextToken());
			int b = Integer.parseInt(st3.nextToken());
			sb.append(arr[b] - arr[a - 1] + "\n");
		}
		System.out.println(sb);
	}

}
