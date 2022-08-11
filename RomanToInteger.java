package com.orthofx;
import java.util.Scanner;

public class RomanToInteger {
	
	 int value (char s) {
		if (s=='I') {
			return 1; 
		}
		else if (s=='V') {
			return 5; 
		}
		else if (s=='X') {
			return 10; 
		}
		else if (s=='L') {
			return 50; 
		}
		else if (s=='C') {
			return 100; 
		}
		else if (s=='D') {
			return 500; 
		}
		else if (s=='M') {
			return 1000; 
		}
		else {
			return -1;
		}
	}
	
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
