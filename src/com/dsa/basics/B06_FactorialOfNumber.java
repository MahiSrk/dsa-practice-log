package com.dsa.basics;

import java.util.Scanner;

public class B06_FactorialOfNumber {

	// by using looping
	static int factorial_m1(int n) {
		
		int f = 1;
		for(int i=1; i<=n; i++) {
			f = f*i;	
		}
		return f;
	}
	
	// by using recursion
	static int factorial_m2(int n) {
		
		if(n==1 || n==0) {
			return 1;	
		}
		else {
			return n*factorial_m2(n-1);
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		if(n>=0) {
		//	System.out.println("Factorial of " + n + " is: " + factorial_m1(n));
			System.out.println("Factorial of " + n + " is: " + factorial_m2(n));	
		}else {
			System.out.println("Factorial of negative number does not exist");
		}

	}

}
