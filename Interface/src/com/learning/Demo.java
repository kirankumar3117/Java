package com.learning;

public class Demo {
	
	public X fun() {
		return new XImpl();
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		X x1=d1.fun();
		x1.funX();
		x1.funY();
		XImpl x2=(XImpl)x1;
		x2.funZ();	
	}
}
