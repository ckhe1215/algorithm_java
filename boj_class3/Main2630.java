package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630 {

	static int white = 0;
	static int blue = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		int[][] map = new int[num][num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < num; j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		recursive(0, num - 1, 0, num - 1, map);
		System.out.println(white + "\n" + blue);
		br.close();
	}
	
	static void recursive(int start, int end, int start2, int end2, int[][] map) {
		boolean same = true;
		for (int i = start2; i <= end2; i++) {
			for (int j = start; j <= end; j++) {
				if (map[i][j] != map[start2][start]) {
					same = false;
					break;
				}		
			}
		}
		if (same) {
			if (map[start2][start] == 0)
				white++;
			else
				blue++;
		} else {
			int mid = (start + end) / 2;
			int mid2 = (start2 + end2) / 2;
			recursive(start, mid, start2, mid2, map);
			recursive(start, mid, mid2 + 1, end2, map);
			recursive(mid + 1, end, start2, mid2, map);
			recursive(mid + 1, end, mid2 + 1, end2, map);
		}
	}

}
