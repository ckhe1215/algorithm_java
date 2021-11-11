package boj_class2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			list.add(q.poll());
		}
		sb.append("<");
		for(int i = 0; i < list.size(); i++) {
			if (i != 0)
				sb.append(", ");
			sb.append(list.get(i));
		}
		sb.append(">");
		System.out.println(sb);
	}

}
