package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7568 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.valueOf(br.readLine());
		int[][] arr = new int[num][2];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
		}
		int[] res = new int[num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					res[i]++;
			}
			sb.append(res[i] + 1 + " ");
		}
		System.out.print(sb);
	}

}
