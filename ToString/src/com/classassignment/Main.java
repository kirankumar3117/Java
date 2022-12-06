package com.classassignment;

public class Main {
	public static Person generatePerson(Person person) {		
		System.out.println(person.toString());
		return null;
	}	
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());	
		}
}
