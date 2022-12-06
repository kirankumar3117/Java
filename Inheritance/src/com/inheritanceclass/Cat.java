package com.inheritanceclass;

public class Cat extends Animal{

	
	void drink() {
		System.out.println(name+ " can dring milk");
	}
	
	void eat() {
		System.out.println("And I can eat fish");
	}
	public static void main(String[] args) {
		Animal c=new Animal();
		
		c.drink();
		
		Cat c2=new Cat();
		
		c2.drink();
		
		Animal c3=new Cat();
		
		//c3.eat();  // can't refer the child class 
		//only we can refer super class methods and over-ride methods
		
		
		c3.drink();
		
		//we can refer child objects from parent class by 
		//downcasting the child 
		
		Cat c4=(Cat)c3;
		
		c4.eat();
	}
}
