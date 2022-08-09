package com.orthofx;
import java.util.Scanner;

public class PyramidUsingWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value of N: ");
		int n = input.nextInt();
		int i=0;
		while (i<=n) {
			for (int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}	
			System.out.print('\n');
			i++;
		}
	}
}
