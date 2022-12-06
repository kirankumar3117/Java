package com.learntodo;

import java.util.Scanner;

public class Array {
	
	void fun1(Student[] student) {
		
		if(student !=null) {
			
			
			for(Student p:student) {
				System.out.println("Roll no is : "+p.getRoll());
				System.out.println("name    is : "+p.getName());
				System.out.println("marks  are : "+p.getMarks());
				
				System.out.println("-----------------------------");
			}
			
		}
		else {
			System.out.println("Passed null value");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		
		//valid --------------
		
		int[] arr2;
		
		arr2=new int[5];
		
		System.out.println(arr2);
		
		//valid -----------------
		
		int[] arr3= {10,20,30,40,50};
		
		System.out.println(arr3);
		
		//valid ---------------------
		
//		int[] arr3;
//		arr3= {10,20,30,40,50};
		
		// Invalid -------------------
		
		
		System.out.println(arr); // [I@75a1cd57
		
		A[] arrr=new A[3];
		
		arrr[0]=new A();
		arrr[1]=new A();
		arrr[2]=new A();
		
		for(A ar:arrr) {
			System.out.println(ar.i);
		}
		
		
		// new code below here
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter The Number Of Students..");
		
		int numStudents=sc.nextInt();
		
		Student[] student=new Student[numStudents];
		
		for(int i=0;i<student.length;i++) {
			
			
			System.out.println("Enter the roll num");
			int roll=sc.nextInt();
			
			System.out.println("Inter the Name");
			String name=sc.next();
			
			System.out.println("Enter marks");
			int marks=sc.nextInt();
			
			
			student[i]=new Student(roll,name,marks);
			
			
		}
		
		Array a1=new Array();
		
		
		a1.fun1(student);
		

	}
	
	
	

}
