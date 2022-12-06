package com.arrays;

import java.util.Scanner;

public class StudentAccess {
	
	void listOfStudents(Student[] student) {
		if(student!=null) {
			
			for(Student p:student) {
				System.out.println("Roll is : "+p.getRoll());
				System.out.println("Name is : "+p.getName());
				System.out.println("Name is : "+p.getMarks());
				System.out.println("------------------------");
			}
			
			
		}
		else {
			System.out.println("Not Accepecting a Null Value");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Number Of Students");
		
		int x=sc.nextInt();
		
		Student[] student=new Student[x];
		
		for(int i=0;i<student.length;i++) {
			
			System.out.println(i+1 + " student details");
			
			System.out.println("Please Enter ROLL Number");
			
			int roll=sc.nextInt();
			
			System.out.println("Enter name");
			
			String name=sc.next();
			
			sc.next();
			System.out.println("Enter marks");
			
			
			int marks=sc.nextInt();
			
			
			student[i]=new Student();
			student[i].setRoll(roll);
			student[i].setName(name);
			student[i].setMarks(marks);
			
		}
		
		StudentAccess sa=new StudentAccess();
		sa.listOfStudents(student);
		

	}

}
