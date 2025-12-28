package com.dsa.basics;

import java.util.Scanner;

public class B11_AreaOfCircle {


	static double calculateArea_m1(int radius) {
		
		return 3.141592653589793 * radius * radius;
	}
	
	static double calculateArea_m2(int radius) {
		
		return Math.PI * radius * radius;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of a circle");
		int r = sc.nextInt();
		//System.out.println(calculateArea_m1(r));
		System.out.println(calculateArea_m2(r));

	}

}
