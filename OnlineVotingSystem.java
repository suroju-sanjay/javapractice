package project1;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("you are not eligible");
		} else {
			System.out.println("enter your gender M/F ");
			String gender = sc.next();
			if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"));
			
				System.out.println("enter voter id :");
				int voterid = sc.nextInt();
				System.out.println("\n select to vote :");
				System.out.println(" 1.for BRS \n ");
				System.out.println("2 for CNG  \n");
				System.out.println("3 for BJP \n");
				System.out.println("4 for NOTA\n");
				int v = sc.nextInt();
				if (v == 1) {
					System.out.println("vote is captured for BRS ");
				} else if (v == 2) {
					System.out.println("vote is captured for CNG");
				} else if (v == 3) {
					System.out.println("vote is captured for BJP ");
				} else if (v == 4) {
					System.out.println("vote is captured for NOTA");
					System.out.println("successfully wasted your vote ");
				}else {
					System.err.println("invalid vote");
				}

				System.out.println("thanks for vote");

			

		}

	}
}
