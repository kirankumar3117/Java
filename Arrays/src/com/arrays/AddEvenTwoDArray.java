package com.arrays;

import java.util.Scanner;

public class AddEvenTwoDArray {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		 
		for(int i=0;i<arr.length;i++) {
			int p=i+1;
			System.out.println("Enter row number " + p );
			
			for(int j=0;j<m;j++) {
				
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			int count=0;
			for(int j=0;j<m;j++) {
				
				if(arr[j][i]%2==0) {
					count+=arr[j][i];
				}
				
			}
			
			System.out.println(count);
		}
		
		
	}
}
