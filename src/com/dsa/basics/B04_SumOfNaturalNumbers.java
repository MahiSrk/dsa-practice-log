package com.dsa.basics;

import java.util.Scanner;

public class B04_SumOfNaturalNumbers {
	
	// by for loop
	 static int sumOfN_m1(int n) {
		 
		 int sum = 0;
		 for(int i = 0; i<=n; i++) {
			 
			 sum = sum + i;
		 }
		 return sum;
	 }
	 
	 // by recursion
	 static int sumOfN_m2(int n) {
		 
		 if(n ==0)
			 return 0;
		 else 
			 return n+sumOfN_m2(n-1);
	 }
	 
	 // by formula
	 static int sumOfN_m3(int n) {
		 
		 return (n*(n+1))/2;
	 }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
//		System.out.println(B4_SumOfNaturalNumbers.sumOfN_m1(n));
//		System.out.println(B4_SumOfNaturalNumbers.sumOfN_m2(n));
		System.out.println(B04_SumOfNaturalNumbers.sumOfN_m3(n));
	}

}
