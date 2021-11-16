package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main9375 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		for (int i = 0; i < num; i++) {
			int cnt = Integer.valueOf(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int j = 0; j < cnt; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				String clothes = st.nextToken();
				if (map.containsKey(clothes)) {
					map.put(clothes, map.get(clothes) + 1);
				} else
					map.put(clothes, 1);
			}
			int result = 1;
			for (int val : map.values()) {
				result *= val + 1;
			}
			System.out.println(result - 1);
		}
	}

}
