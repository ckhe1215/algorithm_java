package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class Main2920 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int type; // 1 : ascending, 2 : descending, 3 : mixed
		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		if (arr[0] < arr[1])
			type = 1;
		else
			type = 2;
		int new_type;
		for(int i = 2; i < 8; i++) {
			if (arr[i - 1] < arr[i]) {
				new_type = 1;
			} else {
				new_type = 2;
			}
			if (new_type != type) {
				type = 3;
				break;
			}
		}
		if (type == 1)
			System.out.print("ascending");
		else if (type == 2)
			System.out.print("descending");
		else
			System.out.print("mixed");
	}

}
