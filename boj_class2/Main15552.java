package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			int sum = 0;
			while (st.hasMoreTokens())
				sum += Integer.valueOf(st.nextToken());
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}

}
