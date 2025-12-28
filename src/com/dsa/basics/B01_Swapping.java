package com.dsa.basics;

import java.util.Scanner;

public class B01_Swapping {

	static void swapByTemp(int a,int b) {
		
		System.out.println("Before swapping a = " +a +" and b = " +b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a = " +a +" and b = " +b);
	}
	
	static void swapByAddn(int a,int b){
		
		System.out.println("Before swapping a = " +a +" and b = " +b);

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping a = " +a +" and b = " +b);

	}
	
	static void swapByMultn(int a, int b) {
		
		System.out.println("Before swapping a = " +a +" and b = " +b);
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("After swapping a = " +a +" and b = " +b);
	}
	
	static void swapByBitwiseOptr(int a,int b) {
		
		System.out.println("Before swapping a = " +a +" and b = " +b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After swapping a = " +a +" and b = " +b);

	}
	
	static void swapBySingleLine(int a,int b) {
		
		System.out.println("Before swapping a = " +a +" and b = " +b);

		a = a+b - (b = a);
		
		System.out.println("After swapping a = " +a +" and b = " +b);

	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
//		swapByTemp(a,b);
//		swapByAddn(a,b);
//		swapByMultn(a,b);
//		swapByBitwiseOptr(a,b);
		swapBySingleLine(a,b);
	}
	

}

