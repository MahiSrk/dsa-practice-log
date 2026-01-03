package com.dsa.recursion;

import java.util.Scanner;

public class R01_PrintNumsOneToNAndNToOne {
	
	// Numbers from n to 1
	static void printNumFromNToOne_m1(int n){
		
		if (n >= 1) {
			System.out.print(n+ " ");
			printNumFromNToOne_m1(n-1);
		}
	}
	
	//Numbers from 1 to n
	static void printNumFromOneToN_m2(int n) {
		
		if(n >= 1) {
			printNumFromOneToN_m2(n-1);
			System.out.print(n+ " ");

		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		          
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		System.out.println("Numbers from n to 1");
		printNumFromNToOne_m1(n);
		
		System.out.println("\n\n--------------------\n");

		System.out.println("Numbers from 1 to n");
		printNumFromOneToN_m2(n);
	}

}
