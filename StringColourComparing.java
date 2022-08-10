package com.orthofx;
import java.util.Scanner;

public class StringColourComparing {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		switch(str)
		{
			case "Apple":
				System.out.println("Output is Red");
				break;
			case "Banana":
				System.out.println("Output is Yellow");
				break;
			default:
				System.out.println("Output is Green");
				break;
		}
	}
}
