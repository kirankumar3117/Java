package com.learntodo;

import java.util.Scanner;

public class Inputtaking {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int x=sc.nextInt();
		
		System.out.println("Inter First Name:");
		sc.next();
		String name=sc.nextLine();
		System.out.println("Enter Last Name:");
		String lastName=sc.nextLine();
		System.out.println("Enter Marks : ");
		int y=sc.nextInt();
		
		System.out.println(x +" "+ name +" "+ lastName+" "+y);
		
		
		
	}

}
