package project1;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bill amount :");
		int a = sc.nextInt();
		double discount=0;
		if (a < 1000) {
			discount=0;
		} else if (a > 1000 && a <= 5000) {
			discount=5;
		} else if (a > 5000 && a <= 10000) {
			discount=10;
		} else{
			discount=20;
		}
		double discountAmount=a*discount/100;
		double finalAmount=a-discountAmount;
		System.out.println("BILL AMOUNT :"+a);
		System.out.println("DISCOUNT  :"+discount);
		System.out.println("DISCOUNT AMOUNT :"+discountAmount);
		System.out.println("FINAL AMOUNT :"+finalAmount);
	}
}