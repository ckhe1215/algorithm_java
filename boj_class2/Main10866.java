package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main10866 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		Deque<Integer> d = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken();
			int param = 0;
			if (st.hasMoreTokens()) {
				param = Integer.valueOf(st.nextToken());
			}
			if (cmd.equals("push_front"))
				d.addFirst(param);
			else if (cmd.equals("push_back"))
				d.addLast(param);
			else if (cmd.equals("pop_front")) {
				if (d.size() == 0)
					sb.append("-1\n");
				else
					sb.append(d.pollFirst() + "\n");
			} else if (cmd.equals("pop_back")) {
				if (d.size() == 0)
					sb.append("-1\n");
				else
					sb.append(d.pollLast() + "\n");
			} else if (cmd.equals("size")) {
				sb.append(d.size() + "\n");
			} else if (cmd.equals("empty")) {
				if (d.isEmpty() == true)
					sb.append("1\n");
				else
					sb.append("0\n");
			} else if (cmd.equals("front")) {
				if (d.size() == 0)
					sb.append("-1\n");
				else
					sb.append(d.peekFirst() + "\n");
			} else if (cmd.equals("back")) {
				if (d.size() == 0)
					sb.append("-1\n");
				else
					sb.append(d.peekLast() + "\n");
			}				
		}
		System.out.print(sb);
	}

}
