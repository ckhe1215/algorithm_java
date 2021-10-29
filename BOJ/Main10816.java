package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10816 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(card);
		int m = Integer.valueOf(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.valueOf(st2.nextToken());
			int lower = lowerBound(card, num);
			int upper = upperBound(card, num);
			sb.append(upper - lower + " ");
		}	
		System.out.print(sb);
	}
	
	private static int lowerBound(int[] card, int num) {
		int min = 0;
		int max = card.length;
		while (min < max) {
			int mid = (min + max) / 2;
			if (card[mid] < num) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}
		return min;
	}
	
	private static int upperBound(int[] card, int num) {
		int min = 0;
		int max = card.length;
		while (min < max) {
			int mid = (min + max) / 2;
			if (card[mid] <= num) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}
		return min;
	}

}
