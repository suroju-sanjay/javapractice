package project1;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age : ");
		int a = sc.nextInt();
		if (a >= 0 && a <= 6) {
			System.out.println("you are kid");
		} else if (a >= 7 && a <= 12) {
			System.out.println("you are child");
		} else if (a >= 13 && a <= 19) {
			System.out.println("you are teen");
		} else if (a >= 20 && a <= 59) {
			System.out.println("adult");
		} else if (a > 60) {
			System.out.println("senior citizen");
		}
	}
}
