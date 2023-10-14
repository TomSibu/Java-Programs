/**************************************************************************************
 * File	            :	MatrixMultiplication.java
 * Description      :   Program to find product of 2 matrices.
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   14/10/23
***************************************************************************************/

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		//Initializing variables
		int k,l,n,m,i,j,h;
		Scanner s = new Scanner(System.in);
		
		//Reading no of rows & columns of matrix 1
		System.out.println("Enter the rows & columns of matrix 1 : ");
		k = s.nextInt();
		l = s.nextInt();
		int matrix1[][] = new int[k][l];
		
		//Reading no of rows & columns of matrix 2
		System.out.println("Enter the rows & columns of matrix 2 : ");
		n = s.nextInt();
		m = s.nextInt();
		int matrix2[][] = new int[n][m];
		
		//Initializing a result matrix
		int result[][] = new int[k][m];
		
		//Reading numbers to matrix 1
		System.out.println("Enter the elements of matrix 1 : ");
		for (i=0;i<k;i++) {
			for (j=0;j<l;j++) {
				matrix1[i][j] = s.nextInt();
			}
		}
		
		//Reading numbers to matrix 2
		System.out.println("Enter the elements of matrix 2 : ");
		for (i=0;i<n;i++) {
			for (j=0;j<m;j++) {
				matrix2[i][j] = s.nextInt();
			}
		}
		
		//Multiplying and printing the resultant matrix
		if (l==n) {
			System.out.println("Product of Matrices :");
			for (i=0;i<k;i++) {
				for (j=0;j<m;j++) {
					result[i][j] = 0;		                           // Setting the value of result[i][j] to 0 before every loop
					for (h=0;h<l;h++) {
						result[i][j] += matrix1[i][h]*matrix2[h][j];   // Expression for multiplying matrices
					}
					System.out.print(" "+result[i][j]);                // Printing the value every time j iterates
				}
				System.out.print("\n");							   // Printing a newline character
			}
			
			
		}
		else {
			System.out.println("Multiplication not possible !");
		}

	}

}
