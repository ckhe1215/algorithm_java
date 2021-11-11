package boj_class2;

import java.io.*;

public class Main1259 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			int num = Integer.valueOf(str);
			if (num == 0)
				break;
			boolean ans = true;
			for (int i = 0; i <= str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
					ans = false;
					break;
				}
			}
			if (ans == true)
				sb.append("yes\n");
			else
				sb.append("no\n");
		}
		System.out.print(sb);

	}

}
