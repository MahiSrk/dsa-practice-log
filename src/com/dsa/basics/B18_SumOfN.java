package com.dsa.basics;

import java.util.Scanner;

public class B18_SumOfN {
	
	static int sum = 0;
	public static int sumOfN(int n) {
		
		sum = n*(n+1)/2;
		return sum; 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sumOfN(n));
		
	}

}
