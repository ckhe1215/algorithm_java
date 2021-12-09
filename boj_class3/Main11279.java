package boj_class3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cnt = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < cnt; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				if (pq.isEmpty())
					sb.append("0\n");
				else
					sb.append(pq.poll() + "\n");
			} else {
				pq.offer(n);
			}
		}
		System.out.print(sb);
		sc.close();
	}

}
