package com.orthofx;
import java.util.Scanner;

public class MatrixAddition {
	public static void main (String[] args) {
		int m, n, i, j;
		Scanner input = new Scanner(System.in);
	    input = new Scanner(System.in);
	    System.out.println("Enter the number of rows of the matrix:");
	    m = input.nextInt();
	    System.out.println("Enter the number of columns of the matrix:");
	    n = input.nextInt();
	    int matrix1[][] = new int[m][n];
	    int matrix2[][] = new int[m][n];
	    System.out.println("Enter the elements of matrix 1:");
	    for (i = 0; i < m; i++)
	    	for (j = 0; j < n; j++)
	    		matrix1[i][j] = input.nextInt();
	    System.out.println("Enter the elements of matrix 2:");
	    for (i = 0; i < m; i++)
	    	for (j = 0; j < n; j++)
	    		matrix2[i][j] = input.nextInt();
	    for(i=0;i<m;i++){    
	    	for(j=0;j<n;j++){    
	    	matrix1[i][j]=matrix1[i][j]+matrix2[i][j];  
	    	System.out.print(matrix1[i][j]+" ");    
	    	}    
	    	System.out.println();
	    	}    
	}
}
