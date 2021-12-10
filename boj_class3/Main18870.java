package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main18870 {

	public static void main(String[] args) throws Exception{
		// 자기보다 작은게 몇개가 있나
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sorted = new int[n];		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sorted[i] = arr[i];
		}
		Arrays.sort(sorted);
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(sorted[i]))
				map.put(sorted[i], cnt++);
		}
		for (int i = 0; i < n; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		System.out.println(sb);
	}

}
