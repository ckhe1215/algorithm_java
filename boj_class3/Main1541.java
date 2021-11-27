package boj_class3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line, "-");
		ArrayList<Integer> arr = new ArrayList<>();
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(str, "+");
			int sum = 0;
			while (st2.hasMoreTokens()) {
				sum += Integer.parseInt(st2.nextToken());
			}
			arr.add(sum);
		}
		int res = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			res -= arr.get(i);
		}
		System.out.println(res);
		sc.close();
	}

}
