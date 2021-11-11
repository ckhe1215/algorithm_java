package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main11723 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		int bitset = 0;
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = 0;
			if (st.hasMoreTokens())
				num = Integer.valueOf(st.nextToken());
			switch(str) {
				case "add" :
					bitset |= (1 << (num - 1));
					break;
				case "remove" :
					bitset &= ~(1 << (num - 1));
					break;
				case "check" :
					if ((bitset & (1 << (num - 1))) > 0)
						sb.append("1\n");
					else
						sb.append("0\n");
					break;
				case "toggle" :
					bitset ^= (1 << (num - 1));
					break;
				case "all" :
					bitset |= ~0;
					break;
				case "empty" :
					bitset &= 0;
					break;
			}
		}
		System.out.println(sb);
	}

}
