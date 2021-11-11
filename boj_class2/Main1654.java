package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1654 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(arr);
		long min = 1;
		long max = arr[arr.length - 1];
		long mid = 0;
		while (min <= max) {
			mid = (min + max) / 2;
			long cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				cnt += arr[i] / mid;
			}
			if (cnt < n) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		System.out.println(max);
	}

}
