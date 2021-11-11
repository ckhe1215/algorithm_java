package boj_class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4153 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			int[] arr = new int[3];
			arr[0]= Integer.valueOf(st.nextToken());
			arr[1] = Integer.valueOf(st.nextToken());
			arr[2] = Integer.valueOf(st.nextToken());
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;
			Arrays.sort(arr);
			if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2])
				sb.append("right\n");
			else
				sb.append("wrong\n");
		}
		System.out.print(sb);
	}

}
