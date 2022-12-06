package com.inheritanceclass;

public class Main extends A{
	Main(){
		super(10);
		System.out.println("Inside Main class constructor");
	}
	public static void main(String[] args) {
		
		Main m1=new Main();		
		m1.funA(); // Inside funA of class A
	}
}
