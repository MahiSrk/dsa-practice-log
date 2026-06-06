package com.dsa.recursion;

import java.util.Scanner;

public class R07_NthFibonacciNumber {
	
	static int nThFibonacciNum(int num) {
		
		if(num==0 || num==1) {
			return num;
		}else
			return nThFibonacciNum(num-1)+nThFibonacciNum(num-2);
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter n value");
	int n = sc.nextInt();
	for(int i= 0; i<n; i++) {
		System.out.print(nThFibonacciNum(i)+", ");
	}
		
	}

}
