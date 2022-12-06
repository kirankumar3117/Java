package com.learntodo;

public class StaticPolymorphysm {
	
	void fun1() {
		System.out.println("Inside fun 1 ");
	}
	void fun1(int x) {
		System.out.println("Inside fun 1 of integer type ");
	}
	void fun1(byte b) {
		System.out.println("Inside fun 1 of byte type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticPolymorphysm s1=new StaticPolymorphysm();
		
		s1.fun1((byte)(10));
	}

}
