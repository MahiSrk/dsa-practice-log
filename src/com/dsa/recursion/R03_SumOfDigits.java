package com.dsa.recursion;

import java.util.Scanner;

public class R03_SumOfDigits {

	static int sumOfDigitsInNumber(int num) {
		if(num==0) {
			return 0;
		}else {
			return (num%10)+sumOfDigitsInNumber(num/10);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int num = sc.nextInt();
		System.out.println(sumOfDigitsInNumber(num));
	}

}
