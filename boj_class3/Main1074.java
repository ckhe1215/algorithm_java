package boj_class3;

import java.util.Scanner;

public class Main1074 {

	static int cnt = 0;
	static int r;
	static int c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		int size = (int) Math.pow(2, n);
		visit(0, 0, size);
		System.out.println(cnt);
		sc.close();
	}
	
	static void visit(int x, int y, int size) {
		if (size > 1) {
			int x_mid = x + size / 2;
			int y_mid = y + size / 2;
			size /= 2;
			if (r < x_mid && c < y_mid) {
				visit(x, y, size);
			} else if (r < x_mid && c >= y_mid) {
				cnt += size * size;
				visit(x, y_mid, size);
			} else if (r >= x_mid && c < y_mid) {
				cnt += size * size * 2;
				visit(x_mid, y, size);
			} else if (r >= x_mid && c >= y_mid) {
				cnt += size * size * 3;
				visit(x_mid, y_mid, size);
			}
		}
	}
}
