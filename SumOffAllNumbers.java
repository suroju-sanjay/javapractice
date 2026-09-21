package project1;

import java.util.Scanner;

public class SumOffAllNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(+n);
		System.out.println("i=" + sum);
	}

}