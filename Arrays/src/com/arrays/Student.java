package com.arrays;

public class Student {
	int roll;
	String name;
	String address;
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

	int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Student(){
		
	}
	
	Student(int roll,String name,int marks){
		System.out.println("Roll is : "+roll);
		System.out.println("name is : "+name);
		System.out.println("address is : "+address);
		System.out.println("marks are : "+marks);
	}
	
	
	
	void studentDetails() {
		System.out.println("Roll is : "+roll);
		System.out.println("name is : "+name);
		System.out.println("address is : "+address);
		System.out.println("marks are : "+marks);
	}
}
