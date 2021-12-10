package boj_class3;

import java.util.Scanner;

public class Main11724 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] map = new int[n + 1][n + 1];
		int[] visit = new int[n + 1];
		int cnt = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		for (int i = 1; i <= n; i++) {
			if (visit[i] == 0) {
				visit[i] = 1;
				cnt++;
				dfs(i, map, visit);
			}
		}
		System.out.println(cnt);
	}
	
	public static void dfs(int n, int[][] map, int[] visit) {
		for (int i = 0; i < map[n].length; i++) {
			if (map[n][i] == 1 && visit[i] == 0) {
				visit[i] = 1;
				dfs(i, map, visit);
			}
		}
	}

}
