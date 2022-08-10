package com.orthofx;
import java.util.Scanner;

public class MatrixMultiply {
	public static void main (String[] args) {
		int m, n, p, q, i, j;
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
	    int matrix1[][] = new int[m][n];
	    int matrix2[][] = new int[p][q];
	    System.out.println("Enter the elements of matrix 1:");
	    for (i = 0; i < m; i++)
	    	for (j = 0; j < n; j++)
	    		matrix1[i][j] = input.nextInt();
	    System.out.println("Enter the elements of matrix 2:");
	    for (i = 0; i < p; i++)
	    	for (j = 0; j < q; j++)
	    		matrix2[i][j] = input.nextInt();    
	}
}
