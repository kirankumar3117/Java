package com.inheritanceclass;

public class A {
	static int x=10;
	int A=20;
	A(int a){
		this();
		System.out.println("Inside A class constructor with parameter "+a);
	}
	A(){
		System.out.println("Inside A zero argument constructor");
	}
	void funA() {
		System.out.println("Inside funA of class A");
	}
}
