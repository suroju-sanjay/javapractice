package project1;

import java.util.Scanner;

public class SalCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salery :");
		int s = sc.nextInt();
		if (s <= 20000) {
			System.out.println("low salery");
		} else if (s > 20000 && s <= 50000) {
			System.out.println("mediam salery");
		} else if (s > 50000 && s <= 100000) {
			System.out.println("high salery");
		} else if (s > 100000) {
			System.out.println("very highest salery");
		}
	}

}
