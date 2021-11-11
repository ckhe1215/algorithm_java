package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main17219 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			map.put(st2.nextToken(), st2.nextToken());
		}
		for (int i = 0; i < m; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		}
		System.out.println(sb);
	}

}
