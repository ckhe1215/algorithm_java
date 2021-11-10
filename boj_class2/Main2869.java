package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class Main2869 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int v = Integer.valueOf(st.nextToken());
		int ans = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0)
			ans++;
		System.out.print(ans);
	}
}
