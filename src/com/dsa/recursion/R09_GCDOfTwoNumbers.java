package com.dsa.recursion;

import java.util.Scanner;

public class R09_GCDOfTwoNumbers {

	static int gcdOfTwoNums(int a,int b) {
		while(a!=b) {
			if (a>b) {
				return gcdOfTwoNums(a-b,b);
			}else {
				return gcdOfTwoNums(a,b-a);
			}
		}
		return a;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 value");
		int n1 = sc.nextInt();
		
		System.out.println("Enter num2 value");
		int n2 = sc.nextInt();
		
		System.out.println(gcdOfTwoNums(n1,n2));
	}

}
