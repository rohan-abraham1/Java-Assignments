package com.orthofx;
import java.util.Scanner;

public class StudentMark {
	public static void main() {
	HashMap<String, Integer> map = new HashMap<>();	
	int i, n, mark;
	String name;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of students: ");
	n = input.nextInt();
	for (i=0;i<n;i++) {
		System.out.println("Enter name of student " + i+1 + " :");
		name = input.nextLine();
		System.out.println("Enter marks of student " + i+1 + " :");
		mark = input.nextInt();
		map.put(name, mark);
		}
	}	
}