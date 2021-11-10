package BOJ;

import java.io.*;
import java.util.*;

public class Main10250 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.valueOf(br.readLine());
		while (cnt-- > 0)
		{
			int a, b, c;
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			a = Integer.valueOf(st.nextToken());
			b = Integer.valueOf(st.nextToken());
			c = Integer.valueOf(st.nextToken());
			int room = 100;
			if (c % a != 0)
				room *= c % a;
			else
				room *= a;
			room += c / a;
			if (c % a != 0)
				room += 1;
			sb.append(room + "\n");
		}
		System.out.print(sb);
	}
}
