package com.hotel;
import java.util.Scanner;
public class Main {
	
	public Hotel funHotel(int price) {
		Hotel hotel=null;
		
		if(price>50 && price <500) {
			hotel=new RoadSideHotel();
		}else {
			hotel=new TajHotel();
		}
		
		return hotel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Money want to spend");
		int money=sc.nextInt();
		Hotel h1=m1.funHotel(money);
		System.out.println("You can eat");
		if(h1 != null) {
			h1.chickenBiryani();
			h1.vegBiryani();
			if(h1 instanceof RoadSideHotel) {
				RoadSideHotel r1=(RoadSideHotel)h1;
				r1.masalaDosa();
			}
			
		}else
			System.out.println("null is not valid");
		
		sc.close();
		
	}

}
