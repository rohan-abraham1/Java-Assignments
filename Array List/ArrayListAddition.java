package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListAddition {
	public static void main (String[] args) {
		ArrayList<Integer[][]> row = new ArrayList<Integer[][]>();
		int m, n, i, j;
		Scanner input = new Scanner(System.in);
	    input = new Scanner(System.in);
	    System.out.println("Enter the number of rows of the matrix:");
	    m = input.nextInt();
	    System.out.println("Enter the number of columns of the matrix:");
	    n = input.nextInt();
	    ArrayList<ArrayList<Integer>> mat = new ArrayList<>(n);
	    ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> mat2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the elements of matrix 1:");
		for (i = 0; i < m; i++) {
			ArrayList<Integer> row1 = new ArrayList<Integer>();
			for (j = 0; j < n; j++) {
				value = input.nextInt();
				row1.add(value);
			}
			mat1.add(row1);
		}
		System.out.println("Enter the elements of matrix 2:");
		for (i = 0; i < m; i++) {
			ArrayList<Integer> row1 = new ArrayList<Integer>();
			for (j = 0; j < n; j++) {
				value = input.nextInt();
				row1.add(value);
			}
			mat2.add(row1);
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (sum.size() < i + 1) {
					sum.add(i, new ArrayList<>());
				}
				sum.get(i).add(j, mat1.get(i).get(j) + mat2.get(i).get(j));
			}
		}
		System.out.println("Sum of Matrices:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(sum.get(i).get(j) + " ");
			System.out.println();
		}
	}
}

