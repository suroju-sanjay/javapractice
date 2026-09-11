package project1;

import java.util.Scanner;

public class Atmwithdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 12000.00;
		int correctpin = 1234;
		System.out.println("enter withdraw amount");
		double withdrawamount = sc.nextDouble();
		if (withdrawamount > balance) {
			System.out.println("insufficiant amount ");
		} else {
			System.out.println("enter pin ");
		}
		int pin = sc.nextInt();
		if (pin != correctpin) {
			System.out.println("incorrect pin");
		} else {
			double newbalance = balance - withdrawamount;
			System.out.println("balance" + balance);
			System.out.println(+withdrawamount + "withdraw successful ");
			System.out.println("pin " + pin);
			System.out.println("available balance " + newbalance);

		}
	}
}