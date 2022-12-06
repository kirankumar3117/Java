package com.learntodo;

public class Consructor {
	
	int x;
	int y=10;
	
	Consructor(){
		System.out.println("Inside constructor ....");
	}
//	
	Consructor(int z){
		System.out.println("Inside Constructor with "+z+" as parameter");
	}

	Consructor(String s){
		System.out.println("Inside Consructor with "+s+" as string parameter");
	}
	
	Consructor(Instance i1){
		i1.main();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consructor c1= new Consructor();
//		Consructor c2= new Consructor(56);
//		Consructor c3= new Consructor("\"Welcome to cunstructor string\"");
//		Consructor c4= new Consructor(new Instance());
		
		Student s1=new Student(10,"kiran",567);
		
		// use the above constructure methos instead writing number of statements 
		
		
//		s1.roll=10;
//		s1.name="kiran";
//		s1.marks=562;
		
		s1.studentDetails();
	}

}
