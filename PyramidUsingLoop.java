package com.orthofx;
import java.util.Scanner;

public class PyramidUsingLoop {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value of N: ");
		int n = input.nextInt();
		for (int i=0;i<=n;i++) {
			for (int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}	
			System.out.print('\n');
		}
	}
}
