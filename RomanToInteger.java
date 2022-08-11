package com.orthofx;
import java.util.Scanner;

public class RomanToInteger {
	
	public static void main(String[] args) {
		int i,n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Roman Numeral Number:");
		String str = input.nextLine();
		n = str.length();
		char[] strArray = new char[n+1];
		for (i=0; i<n; i++) {
            strArray[i] = str.charAt(i);
		}
	}
	
	 
}
