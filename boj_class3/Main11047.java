package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11047 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] nums = str.split(" ");
		int n = Integer.parseInt(nums[0]);
		int k = Integer.parseInt(nums[1]);
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > k) continue;
			int temp = k / arr[i];
			cnt += temp;
			k -= temp * arr[i];
			if (k == 0) break;
		}
		System.out.println(cnt);
	}

}
