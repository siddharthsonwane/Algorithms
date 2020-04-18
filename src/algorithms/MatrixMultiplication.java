package algorithms;

import java.util.Scanner;

public class MatrixMultiplication {
	
	
	
	public static void main(String[] args) {
		
		
		int n,m,p,q,sum = 0,c,d,k;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		
		m = in.nextInt();
		n = in.nextInt();
		
		int first [][] = new int [m][n];
		
		System.out.println("Enter element of first matrix");
		
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d] = in.nextInt();
		
		
		System.out.println("Enter the  number of rows and columns for second matrix");
		
		p = in.nextInt();
		q= in.nextInt();
		
		int second[][] = new int [p][q];
		
		int multiply[][] = new int [m][q];
		
		
		System.out.println("Enter the element for  second matrix");
		
		for(c= 0;c<p;c++)
			for(d=0;d<q;d++)
				second[c][d] = in.nextInt();
		
		
		for(c=0;c<m;c++) {
			for(d=0;d<q;d++) {
				for(k=0;k<p;k++) {
					sum = sum + first[c][k] + second[d][k];
					
					multiply[c][d] = sum;
					
					sum = 0;
				}
			}
		}
		
		
	System.out.println("Matrix result:");
	
	for(c=0;c<m;c++) {
		for(d=0;d<q;d++) {
			System.out.println(multiply[c][d]+"\t");
			
			System.out.println("\n");
	     	
		}
	}
		
	}



	
	
	
}
