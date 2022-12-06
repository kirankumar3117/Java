package com.assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a1= new Animal[3];
		
		a1[0]=new Dog();
		a1[1]=new Cat();
		a1[2]=new Tiger();
		
		for(Animal ar:a1) {
			ar.makeNoise();
		}

	}

}
