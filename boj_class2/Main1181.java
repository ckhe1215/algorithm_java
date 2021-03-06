package boj_class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.valueOf(br.readLine());
		String[] arr = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length())
					return s1.compareTo(s2);
				else
					return (s1.length() - s2.length());
			}
		});
		sb.append(arr[0] + "\n");
		for (int i = 1; i < cnt; i++) {
			if (!arr[i].equals(arr[i - 1]))
				sb.append(arr[i] + "\n");
		}
		System.out.print(sb);
	}

}
