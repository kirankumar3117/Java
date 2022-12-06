package com.classassignment;

public class Instructor extends Person{
	int instrcutorId=456;
	int salary=45601;
	@Override
	public String toString() {
		return "Instructor [instrcutorId=" + instrcutorId + ", salary=" + salary
				+ "\n"+"Address()=" + Address() + "]";
	}
}
