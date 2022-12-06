package com.learning;

public class XImpl implements X {
	@Override
	public void funX() {
		System.out.println("Inside funX() of XImpl");
	}
	@Override
	public void funY() {
		System.out.println("Inside funY() of XImpl");
	}	
	void funZ() {
		System.out.println("Inside funZ() of XImpl");
	}
}
