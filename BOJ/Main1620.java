package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main1620 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.valueOf(st.nextToken());
		int quiz = Integer.valueOf(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		String[] dict = new String[num + 1];
		for (int i = 1; i <= num; i++) {
			String temp = br.readLine();
			map.put(temp, i);
			dict[i] = temp;
		}
		for (int i = 1; i <= quiz; i++) {
			String q = br.readLine();
			if (q.charAt(0) >= '0' && q.charAt(0) <= '9') {
				sb.append(dict[Integer.valueOf(q)] + "\n");
			} else {
				sb.append(map.get(q) + "\n");
			}
		}
		System.out.print(sb);
	}

}
