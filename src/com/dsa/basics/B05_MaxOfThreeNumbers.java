package com.dsa.basics;

import java.util.Scanner;

public class B05_MaxOfThreeNumbers {

	// by using manual method
	static int maxOfThreeNum_m1(int a,int b,int c){
		
		return (a>b && a>c)? a:(b>c? b:c);
	}
	
	// by using max method of math class
	static int maxOfThreeNum_m2(int a,int b,int c){
			
			return Math.max(Math.max(a, b),c);
		}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Value");
		int a = sc.nextInt();
		
		System.out.println("Enter b Value");
		int b = sc.nextInt();
		
		System.out.println("Enter c Value");
		int c = sc.nextInt();
		
//		System.out.println("Maximum number is: " + maxOfThreeNum_m1(a,b,c));
		System.out.println("Maximum number is: " + maxOfThreeNum_m2(a,b,c));
	
	}

}
