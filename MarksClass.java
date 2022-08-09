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
		input.close();
	}
}
