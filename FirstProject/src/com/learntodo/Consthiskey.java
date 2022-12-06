package com.learntodo;

public class Consthiskey {
	
	Consthiskey(){
		this(10);
		System.out.println("Inside Consthiskey Constructure..");
	}
	
	Consthiskey(int x){
		this("kiran");
		System.out.println("Inside Consthiskey Integer Constructure..");
	}
	
	Consthiskey(String s){
		System.out.println("Inside Costhiskey String...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consthiskey c1=new Consthiskey();
	}

}
