package com.orthofx;
import java.util.Scanner;

public class StringRev {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		char temp;
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		char[] strArray = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
            strArray[i] = str.charAt(i);
		}
	}
}
