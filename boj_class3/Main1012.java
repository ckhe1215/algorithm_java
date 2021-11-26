package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1012 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		for (int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			boolean[][] map = new boolean[n][m];
			boolean[][] visited = new boolean[n][m];
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st2.nextToken());
				int y = Integer.parseInt(st2.nextToken());
				map[y][x] = true;
			}
			int cnt = 0;
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < m; b++) {
					if (map[a][b] && !visited[a][b]) {
						visited[a][b] = true;
						dfs(a, b, n, m, map, visited);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		br.close();
	}
	
	static void dfs(int x, int y, int n, int m, boolean[][] map, boolean[][] visited) {
		int[] dx = {-1, 0, 0, 1};
		int[] dy = {0, -1, 1, 0};
		for (int i = 0; i < 4; i++) {
			int new_x = x + dx[i];
			int new_y = y + dy[i];
			if (new_x >= 0 && new_x < n && new_y >= 0 && new_y < m
				&& map[new_x][new_y] && !visited[new_x][new_y]) {
				visited[new_x][new_y] = true;
				dfs(new_x, new_y, n, m, map, visited);
			}
		}
	}

}
