package com.orthofx;
import java.util.Scanner;

public class PyramidUsingWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value of N: ");
		int n = input.nextInt();
		int i,j,k;
		i=1;
		while (i<=n) {
			j=0;
			while (j<=n-i-1) {
				System.out.print(" ");
				j++;
			}
			k=0;
			while (k < 2*i-1) {
				System.out.print("*");
				k++;
			}	
			System.out.print('\n');
			i++;
		}
	}
}
