package com.dsa.basics;

import java.util.Scanner;

public class B03_EvenOrOdd {
	
	static void evenOddNum(int n) {
		
		if(n%2 == 0) {
			System.out.println(n +" is Even Number");
		}else {
			System.out.println(n+ " is an Odd Number"); 
		}
	}
	
	static String checkEvenOddNum(int n) {
		
		return (n%2 == 0)? + n +" is Even Number": n +" is an Odd Number";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
//		evenOddNum(n);
		System.out.println(checkEvenOddNum(n));
	}

}
