package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class Main1085 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x, y, w, h;
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		x = Integer.valueOf(st.nextToken());
		y = Integer.valueOf(st.nextToken());
		w = Integer.valueOf(st.nextToken());
		h = Integer.valueOf(st.nextToken());
		int min = 10000;
		min = Math.min(x, y);
		min = Math.min(min, w - x);
		min = Math.min(min, h - y);
		System.out.print(min);
	}

}
