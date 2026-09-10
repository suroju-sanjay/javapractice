package project1;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature");
		int t = sc.nextInt();
		if (t < 15) {
			System.out.println("FREEZE ");
		} else if (t >= 15 && t < 25) {
			System.out.println("COOL");
		} else if (t >= 25 && t < 35) {
			System.out.println("NORMAL");
		} else if (t >= 35 && t < 45) {
			System.out.println("HOT ");
		} else if (t >= 45) {
			System.out.println("VERY HOT");
		}
	}
}