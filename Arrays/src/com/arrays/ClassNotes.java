package com.arrays;

public class ClassNotes {
	
	
	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		
		for(int[] i:arr) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
}
}
