package com.orthofx;

import java.util.Scanner;

public class ForestShootingEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, pos, low = 2;
		System.out.println("Enter number of people: ");
		n = input.nextInt();
		do {
			low *= 2;
		} while(n>low);
		low /= 2;
		System.out.println((n - low)*2);
	}
}
