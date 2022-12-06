package com.arrays;

public class FindPrime {
	
	Boolean prime(int x) {
		
		int count=0;
		
		if(x==2) {
			return true;
		}
		
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				count++;
			}
		}
		
		if(count>0)
			return false;
		
		return true;
		
	}
	
	void findPrime(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			Boolean b=prime(arr[i]);
			if(b) {
				System.out.println(arr[i] + "is a prime");
				count++;
			}
			
		}
		
		if(count==0) {
			System.out.println("There are no prime numbers in this array");
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,6,7,8,9};
		
		FindPrime p1=new FindPrime();
		
		p1.findPrime(arr);
	}
}
