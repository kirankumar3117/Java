package com.inheritanceclass;

public class Demo {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Welcome dude";
	}
	
	 public  Object obj(int x) {
		 System.out.println("Inside the Object");
		
			 return new A();
		 
	}
	 
	 void fun1() {
		 System.out.println("Inside fun1 of Demo");
	 }
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		System.out.println(d1);
		
		d1.fun1();
		
		
		
		
//		Object obj=d1.obj(10);
		
		A a1=(A)d1.obj(10);
		
		a1.funA();
		
	
		
		
//		if(obj instanceof A) {
//			A a1=(A)obj;
//			a1.funA();
//		}
//		else {
//			B b1=(B)obj;
//			b1.funB();
//		}
		
	}
}
