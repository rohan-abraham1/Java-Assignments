package com.orthofx;
import java.util.Scanner;

public class StringRev {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int n = str.length();
		char[] strArray = new char[n+1];
		for (i=0; i<n; i++) {
            strArray[n-i-1] = str.charAt(i);
		}
		for (i=0;i<n;i++)
			System.out.print(strArray[i]);
	}
}
