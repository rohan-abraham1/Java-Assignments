package com.orthofx;
import java.util.Scanner;

public class RomanToInteger {
	
	 static int findValue (char s) {
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
		int i,n,a,b,tot=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Roman Numeral Number:");
		String str = input.nextLine();
		n = str.length();
		for (i=0;i<n;i++) {
			if(i < n-1) {
				a = findValue(str.charAt(i));
				b = findValue(str.charAt(i+1));
				if( a >= b ) {
					tot += a;
				}
				else {
					tot -= a;
				}
			}
		}
		tot += findValue(str.charAt(n-1));
		System.out.print("Integer value is:" + tot);
	}
}
