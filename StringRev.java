package com.orthofx;
import java.util.Scanner;

public class StringRev {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		int n = str.length();
		char[] strArray = new char[n];
		char[] strArray2 = new char[n];
		for (i=0; i<n; i++) {
            strArray[i] = str.charAt(i);
		}
		strArray2 = strArray;
		for (i=0;i<n;i++)
            {strArray[i] = strArray2[n-i-1];}
        System.out.println(new String(strArray));
	}
}