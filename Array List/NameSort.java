package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NameSort {
	public static void main(String[] args) {
		int i;
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter names of 10 people:");
		for (i=0;i<10;i++) {
			String str = input.nextLine();
			names.add(str);
		}
		Collections.sort(names);
		System.out.println("Names sorted:");
		for (String name : names) {
		      System.out.println(name);
		    }
	}
}
