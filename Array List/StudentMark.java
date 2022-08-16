package com.orthofx;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMark {
	public static void main() {
		HashMap<String, Integer> map = new HashMap<>();	
		int i, n, mark;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n = input.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println("Enter name of student " + i + " :");
			name = input.next();
			System.out.println("Enter marks of student " + i + " :");
			mark = input.nextInt();
			map.put(name, mark);
		}
		System.out.println("Enter name of student whose marks to display: ");
		name = input.next();
		if (map.containsKey(name)) {
			mark = map.get(name);
			System.out.println("Mark of Student entered is:" + mark);
		}	
	else
		System.out.println("Invalid Student name!");
	}	
}