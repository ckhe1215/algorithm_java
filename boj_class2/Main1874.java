package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		boolean success = true;
		int last = 1;
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			while (n >= last) {
				st.push(last++);
				sb.append("+\n");
			}
			if (n == st.peek()) {
				st.pop();
				sb.append("-\n");
			} else {
				success = false;
				break;
			}
		}
		if (success)
			System.out.print(sb);
		else
			System.out.print("NO\n");
	}

}
