package boj_class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main1931 {

	static class Meeting {
		int start;
		int end;
		
		Meeting(int s, int e) {
			start = s;
			end = e;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		Meeting[] arr = new Meeting[num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			Meeting m = new Meeting(s, e);
			arr[i] = m;
		}
		Arrays.sort(arr, new Comparator<Meeting>(){
			@Override
			public int compare(Meeting o1, Meeting o2) {
				if (o1.end == o2.end)
					return o1.start - o2.start;
				return o1.end - o2.end;
			}
		});
		int cnt = 0;
		int prev = 0;
		for (int i = 0; i < num; i++) {
			if (arr[i].start >= prev) {
				prev = arr[i].end;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
