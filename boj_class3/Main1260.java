package boj_class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		boolean[] visited = new boolean[n + 1];
		boolean[][] map = new boolean[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = true;
			map[b][a] = true;
		}
		dfs(v, map, visited, sb);
		for (int i = 0; i <= n; i++) {
			visited[i] = false;
		}
		sb.append("\n");
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;
		bfs(map, visited, queue, sb);
		System.out.println(sb);
		sc.close();
	}
	
	static void dfs(int start, boolean[][] map, boolean[] visited, StringBuilder sb) {
		if (!visited[start]) {
			visited[start] = true;
			sb.append(String.valueOf(start) + " ");
		}
		for (int i = 1; i < map[1].length; i++) {
			if (map[start][i] && !visited[i])
				dfs(i, map, visited, sb);
		}
	}

	static void bfs(boolean[][] map, boolean[] visited, Queue<Integer> queue, StringBuilder sb) {
		while (!queue.isEmpty()) {
			int num = queue.poll();
			sb.append(String.valueOf(num) + " ");
			for (int i = 1; i < map[1].length; i++) {
				if (map[num][i] && !visited[i]) {
					visited[i] = true;
					queue.offer(i);
				}
			}
		}
	}
}
