package com.orthofx;
import java.util.Scanner;

public class MatrixMultiplyWithConstant {
	public static void main (String[] args) {
		int m, n, num, i, j;
		Scanner input = new Scanner(System.in);
	    input = new Scanner(System.in);
	    System.out.println("Enter the number of rows of the matrix:");
	    m = input.nextInt();
	    System.out.println("Enter the number of columns of the matrix:");
	    n = input.nextInt();
	    int matrix[][] = new int[m][n];
	    System.out.println("Enter the elements of matrix:");
	    for (i = 0; i < m; i++)
	    	for (j = 0; j < n; j++)
	    		matrix[i][j] = input.nextInt();
	}
}
