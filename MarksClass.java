package com.orthofx;
import java.util.Scanner;

public class MarksClass {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int mark = input.nextInt();
		if (mark >= 90) {
			System.out.println("Amazing");
		}
		else if (mark >= 80) {
			System.out.println("Good");
		}
		else if (mark >= 70) {
			System.out.println("All right");
		}
		else if (mark < 70) {
			System.out.println("Okay");
		}
		input.close();
	}
}
