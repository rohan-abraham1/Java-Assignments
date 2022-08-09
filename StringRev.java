package com.orthofx;
import java.util.Scanner;

public class StringRev {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		char temp;
		int i;
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int n = str.length();
		char[] strArray = new char[n];
		for (i=0; i<n; i++) {
            strArray[i] = str.charAt(i);
		}
		for (i=0;i<n;i++) {
			temp = strArray[i];
			strArray[i] = strArray[n-i-1];
			strArray[n-i-1] = temp;
		}
		System.out.print("Reversed String is: ");
		for (i=0;i<n;i++) {
			System.out.print(strArray[i]);
		}
	}
}
