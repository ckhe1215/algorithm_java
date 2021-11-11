package boj_class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10814 {

	static class Person {
		private int num;
		private int age;
		private String name;
		
		Person(int n, int a, String name) {
			this.num = n;
			this.age = a;
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		int num = Integer.valueOf(br.readLine());
		Person[] arr = new Person[num];
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			arr[i] = new Person(i, age, name);
		}
		Arrays.sort(arr, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		});
		for (int i = 0; i < num; i++) {
			sb.append(arr[i].age + " " + arr[i].name + "\n");
		}
		System.out.print(sb);
	}

}
