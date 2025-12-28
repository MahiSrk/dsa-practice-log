package com.dsa.basics;

import java.util.Scanner;

public class B02_MaxOfTwoNum {

	// by using manual method
	static int maxOfTwo(int a, int b) {
		return (a>b)?a:b;		
	}
	
	// by using max method of math class
	static int maxOfTwoNum(int a,int b) {
		
		return Math.max(a, b);
	}
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = obj.nextInt();
		System.out.println("Enter b value");
		int b = obj.nextInt();
//		System.out.println("Max value = " + maxOfTwo(a,b));
		System.out.println("Max value = " + maxOfTwoNum(a,b));

	}

}
