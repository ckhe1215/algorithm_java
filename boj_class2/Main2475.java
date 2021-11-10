package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2475 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = bf.readLine().split(" ");
		int[] nums = new int[5]; 
		int sum = 0;
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.valueOf(strs[i]);
			sum += nums[i] * nums[i];
		}
		System.out.print(sum % 10);
	}

}
