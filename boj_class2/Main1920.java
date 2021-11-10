package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1920 {

	private static int binarySearch(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > value) {
				high = mid - 1;
			} else if (arr[mid] < value) {
				low = mid + 1;
			} else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.valueOf(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int num2 = Integer.valueOf(br.readLine());
		int[] arr2 = new int[num2];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < num2; i++) {
			arr2[i] = Integer.valueOf(st2.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 0; i < num2; i++) {
			int ans = binarySearch(arr, arr2[i]);
			if (ans >= 0)
				sb.append(1 + "\n");
			else
				sb.append(0 + "\n");
		}
		System.out.print(sb);
	}

}
