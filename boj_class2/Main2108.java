package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2108 {

	private static int avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return (int)Math.round((double)sum / arr.length);
	}
	
	private static int mid(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length / 2];
	}
	
	private static int frequent(int[] arr) {
		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int find = 0;
			for (int j = 0; j < list.size(); j++) {
				if (arr[i] == list.get(j)[0]) {
					list.get(j)[1]++;
					find = 1;
				}
			}
			if (find == 0) {
				int[] temp = {arr[i], 1};
				list.add(temp);
			}
		}
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		ArrayList<Integer> freqList = new ArrayList<>();
		int freqCnt = list.get(list.size() - 1)[1];
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i)[1] == freqCnt)
				freqList.add(list.get(i)[0]);
			else
				break;
		}
		Collections.sort(freqList);
		if (freqList.size() > 1)
			return freqList.get(1);
		return freqList.get(0);
	}
	
	private static int range(int[] arr) {
		Arrays.sort(arr); 
		// Arrays.stream(arr).max().getAsInt();
		return arr[arr.length - 1] - arr[0];
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		System.out.println(avg(arr));
		System.out.println(mid(arr));
		System.out.println(frequent(arr));
		System.out.println(range(arr));
	}

}
