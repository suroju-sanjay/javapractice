package project1;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		String yn = " ";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER FIRST NUMBER :");
			double d1 = sc.nextDouble();
			System.out.println("ENTER SECOND NUMBER :");
			double d2 = sc.nextDouble();
			System.out.println("enter symbol like +_*/%");
			String symb = sc.next();
			switch (symb) {
			case "+" -> System.out.println("the sum of two number is :" + (d1 + d2));
			case "-" -> System.out.println("the difference of two number is :" + (d1 - d2));
			case "*" -> System.out.println("the product of two number is :" + (d1 * d2));
			case "/" -> System.out.println("the division of two number is :" + (d1 / d2));
			case "%" -> System.out.println("the moduler of two number is :" + (d1 % d2));
			default -> System.out.println("invalid operator ");
			}
			System.out.println("DO YOU WANT TO CONTINUE YES FOR y NO FOR n");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("you clicked for exit ");
	}
}