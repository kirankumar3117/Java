package com.questionone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("Enter the numer of passengers");
		int noOfPas=scanner.nextInt();
		System.out.println("Enter the number of kilometers");
		int noOfKm=scanner.nextInt();
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(noOfPas, noOfKm);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is"+ res);
		}

}
