package boj_class3;

import java.util.Scanner;

public class Main2606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int num = sc.nextInt();
		boolean[][] map = new boolean[101][101];
		boolean[]visited = new boolean[101];
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = true;
			map[b][a] = true;
		}
		dfs(1, map, visited, cnt);
		int virus = 0;
		for (int i = 1; i <= cnt; i++) {
			if (visited[i] == true)
				virus++;
		}
		System.out.println(virus - 1);
		sc.close();
	}
	
	static void dfs(int start, boolean[][] map, boolean[] visited, int cnt) {
		if (!visited[start]) visited[start] = true;
		for (int i = 1; i <= cnt; i++) {
			if (map[start][i] && !visited[i]) {
				visited[i] = true;
				dfs(i, map, visited, cnt);
			}
		}
	}

}
