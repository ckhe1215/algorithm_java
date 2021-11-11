package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < num; i++) {
			int n = Integer.valueOf(br.readLine());
			if (n != 0)
				stack.add(n);
			else
				stack.pop();
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.print(sum);
	}

}
