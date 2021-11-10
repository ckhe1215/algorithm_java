package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			Stack<Character> st = new Stack<>();
			if (str.equals("."))
				break;
			boolean ans = true;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(')
					st.add('(');
				else if (str.charAt(i) == '[')
					st.add('[');
				else if (str.charAt(i) == ')') {
					if (st.isEmpty() || st.pop() != '(') {
						ans = false;
						break;
					}
				} else if (str.charAt(i) == ']') {
					if (st.isEmpty() || st.pop() != '[') {
						ans = false;
						break;
					}
				} 
			}
			if (st.isEmpty() && ans)
				sb.append("yes\n");
			else
				sb.append("no\n");
		}
		System.out.print(sb);
	}

}
