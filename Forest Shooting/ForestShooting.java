package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class ForestShooting {

	static ArrayList<Integer> line = new ArrayList<Integer>();
	static int flag, n, i;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of people: ");
		n = input.nextInt();
		for (i = 1; i <= n; i++) {
			line.add(i);
		}
		fireOne();
	}

	static void fireOne() {
		n = line.get(line.size()-1);
		for (i = 0; i < line.size(); i ++) {
			line.remove(i);
		}
		System.out.println(line);
		if (line.size() == 1) {
			System.out.println(line);
			System.exit(0);
		}
		else {
			if (line.get(line.size()-1) == n) {
				fireOne();
			}
			else {
				fireTwo();
			}
		}	
	}
	
	static void fireTwo() {
		n = line.get(line.size()-1);
		for (i = 1; i < line.size(); i ++) {
			line.remove(i);
		}
		System.out.println(line);
		if (line.size() == 1) {
			System.out.println(line);
			System.exit(0);
		}
		else {
			if (line.get(line.size()-1) == n) {
				fireOne();
			}
			else {
				fireTwo();
			}
		}
	}
}
