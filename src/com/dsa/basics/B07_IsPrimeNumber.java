package com.dsa.basics;

import java.util.Scanner;

public class B07_IsPrimeNumber {

	//by for loop
	static boolean isPrimeNum_m1(int n) {
		
		int f = 0;
		
		for(int i=1; i <=n; i++) {
			if(n%i == 0) {
				f++;
			}
		}
		return f==2;
	}
	
	//by recursion
	static boolean isPrimeNum_m2(int n,int i) {
		
		if(i==1) {
			return true;
		}
		else if(n%i == 0){
			return false;
		}
		else {
			return isPrimeNum_m2(n,--i);
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			// methods calling
			System.out.println(i+ "\t" + (B07_IsPrimeNumber.isPrimeNum_m1(i)?"Yes":"No")+ "\t" +(B07_IsPrimeNumber.isPrimeNum_m2(i, i/2)? "Yes":"No"));
		}
	
	}

}
