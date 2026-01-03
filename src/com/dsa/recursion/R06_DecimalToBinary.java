package com.dsa.recursion;

import java.util.Scanner;

public class R06_DecimalToBinary {

	static int convertDecimalToBinary(int num) {
		if (num == 0) {
			return 0;
		}else {
			return (num%2+10*convertDecimalToBinary(num/2));
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int num = sc.nextInt();
		
		System.out.println(convertDecimalToBinary(num));
		
	}

}
