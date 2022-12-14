package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMultiplication {
	public static void main (String[] args) {
		int m, n, p, q, i, j, k;
		Scanner input = new Scanner(System.in);
	    input = new Scanner(System.in);
	    System.out.println("Enter the number of rows of the matrix 1:");
	    m = input.nextInt();
	    System.out.println("Enter the number of columns of the matrix 1:");
	    n = input.nextInt();
	    System.out.println("Enter the number of rows of the matrix 2:");
	    p = input.nextInt();
	    System.out.println("Enter the number of columns of the matrix 2:");
	    q = input.nextInt();
	    ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> mat2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> mul = new ArrayList<ArrayList<Integer>>();
		for (i = 0; i < m; i++) {
			ArrayList<Integer> row1 = new ArrayList<Integer>();
			for (j = 0; j < n; j++) {
				value = input.nextInt();
				row1.add(value);
			}
			mat1.add(row1);
		}
		for (i = 0; i < p; i++) {
			ArrayList<Integer> row1 = new ArrayList<Integer>();
			for (j = 0; j < q; j++) {
				value = input.nextInt();
				row1.add(value);
			}
			mat2.add(row1);
		}
		if (m != q)
			System.out.println("Multiplication Not Possible");
		else {
			for (i = 0; i < m; i++) {
				for (j = 0; j < q; j++) {
					temp = 0;
					for (k = 0; k < p; k++) {
						if (mul.size() < i + 1) {
							mul.add(i, new ArrayList<>());
						}
						temp += mat1.get(i).get(k) * mat2.get(k).get(j);
						mul.get(i).add(j, temp);
					}
				}
			}
			System.out.println("Multiplcation of Matrices:");
			for (i = 0; i < m; i++) {
				for (j = 0; j < q; j++)
					System.out.print(mul.get(i).get(j) + " ");
				System.out.println();
			}
		}
	}
}

