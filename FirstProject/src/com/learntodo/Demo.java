package com.learntodo;

public class Demo {
	
	static int x;
	
	static Demo d1=new Demo();
	
	public static void main(String[] args) {
		Instance i1=new Instance();
		
		i1.main();
		
		Demo d1=new Demo();
		
		System.out.println(x);
		
		d1.x=100;
		
		System.out.println("x "+d1.x);
		
		System.out.println("x1 "+d1.x); 
	}
}
