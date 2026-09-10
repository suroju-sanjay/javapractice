package project1;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks :");
		int marks = sc.nextInt();
		if (marks > 100 && marks < 0) {
			System.out.println("inavalid marks");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("grade :A ");
		} else if (marks > 75 && marks <= 89) {
			System.out.println("grade B");
		} else if (marks > 60 && marks <= 74) {
			System.out.println("grade C");
		} else if (marks > 40 && marks <= 59) {
			System.out.println("grade D");
		} else if (marks < 40) {
			System.out.println("you are failed");

		}
	}
}
