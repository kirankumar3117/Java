package com.learntodo;

public class Student {

	
	int roll;
	String name;
	int marks;
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

	Student(){
		
	}
	
	Student(int roll,String name,int marks){
		this.name=name;
		this.marks=marks;
		this.roll=roll;
	}
	
	public void studentDetails() {
		System.out.println("Roll number is "+roll );
		System.out.println("Name is        "+name);
		System.out.println("marks are      "+marks);
	}
}
