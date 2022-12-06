package com.questionone;

public  class Ola {
	public  Car bookCar(int numberOfPassenger, int numberOfKMs) {
		Car c1=new Car();
		c1.noOfKms=numberOfKMs;
		c1.noOfPassangers=numberOfPassenger;
		
		return c1;
	}
	public int calculateBill(Car car) {
		int total;
		if(car.noOfKms<3) {
			total=((Sedan)car).farePerKm;
		}
		else {
			total=((Hatchback)car).farePerKm;
		}       
		return (car.noOfKms*total);
	}
}
