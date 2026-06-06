package com.dsa.basics;

import java.util.Scanner;

public class B16_GcdOfN {
	
	public static int gcd(int A,int B) {
		for( ;A!=0;) {
			int A_ = B%A;
			int B_ = A;
			A = A_;
			B = B_;
		}
		return B;
	}

	
	public static void gcdOfN() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int no = sc.nextInt();
			ans = gcd(ans,no);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {

		gcdOfN();

	}

}
