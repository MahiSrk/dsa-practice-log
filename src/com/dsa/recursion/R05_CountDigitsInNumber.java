package com.dsa.recursion;

import java.util.Scanner;

public class R05_CountDigitsInNumber {
	
	static int count= 0;
	
	static int countDigits(int num) {
		
		if(num!=0) {		
			count ++;
			countDigits(num/10);
		}
		return (count!=0)?count:1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int num = sc.nextInt();
		
		System.out.println(countDigits(num));	
	}
}
