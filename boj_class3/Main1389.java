package boj_class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1389 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] map = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		int min = Integer.MAX_VALUE;
		int min_person = 0;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (i == j) continue;
				cnt += bfs(i, j, map, n); // i부터 j까지 몇번에 걸쳐 가야하는지 세기
			}
			if (cnt < min) {
				min = cnt;
				min_person = i;
			}
		}
		System.out.println(min_person);
		sc.close();
	}
	
	static int bfs(int s, int e, int[][] map, int num) {
		int[] visit = new int[num + 1];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < map[0].length; i++) {
			if (map[s][i] == 1) {
				q.offer(i);
				visit[i] = 1;
			}
		}
		while (!q.isEmpty()){
			int n = q.poll();
			if (n == e) break;
			for (int i = 1; i < map[0].length; i++) {
				if (map[n][i] == 1 && visit[i] == 0) {
					q.offer(i);
					visit[i] = visit[n] + 1;
				}
			}
		}
		return visit[e];
	}
}
