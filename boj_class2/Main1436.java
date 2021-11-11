package boj_class2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int name = 665;
		while (cnt != num)
		{
			name++;
			if (have6MoreThan3times(name))
				cnt++;
		}
		System.out.print(name);
	}
	
	private static boolean have6MoreThan3times(int name) {
		String num = String.valueOf(name);
		for (int i = 2; i < num.length(); i++) {
			if (num.charAt(i) == '6' && 
				num.charAt(i - 1) == '6' &&
				num.charAt(i - 2) == '6')
				return true;
		}
		return false;
	}

}
