package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1966 {

	static class Pair {
		
		int num;
		boolean target;		
		
		Pair(int n, boolean t) {
			this.num = n;
			this.target = t;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.valueOf(br.readLine());
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int doc = Integer.valueOf(st.nextToken());
			int find = Integer.valueOf(st.nextToken());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			Queue<Pair> q = new LinkedList<>();
			Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			for (int j = 0; j < doc; j++) {
				int num = Integer.valueOf(st2.nextToken());
				q.offer(new Pair(num, j == find));
				pq.offer(num);
			}
			int ans = 0;
			while (!q.isEmpty()) {
				Pair temp = q.poll();
				if (temp.num == pq.peek()) {
					pq.poll();
					ans++;
					if (temp.target) {
						sb.append(ans + "\n");
						break;
					}
				} else {
					q.offer(temp);
				}
			}
		}
		System.out.print(sb);
	}

}
