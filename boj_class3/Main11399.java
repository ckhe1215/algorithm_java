package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11399 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int[] sum = new int[cnt];
		sum[0] = arr[0];
		for (int i = 1; i < cnt; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		int res = 0;
		for (int i = 0; i < cnt; i++)
			res += sum[i];
		System.out.println(res);
	}

}
