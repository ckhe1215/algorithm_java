package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int[] arr = new int[n];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int min = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(st2.nextToken());
			if (arr[i] > max)
				max = arr[i];
		}
		while (min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] > mid)
					sum += arr[i] - mid;
			}
			if (sum > m)
				min = mid + 1;
			else
				max = mid;
		}
		System.out.println(max);
	}
}
