package com.dsa.recursion;

import java.util.Scanner;

public class R06_DecimalToBinary {

	
	static int convertDecimalToBinary_m1(int num) {
		if (num == 0) {
			return 0;
		}else {
			return (num%2+10*convertDecimalToBinary_m1(num/2));
		}
	}
		static void convertDecimalToBinary_m2(int num) {
		if (num == 0) {
			System.out.println(" ");
		}else {
			convertDecimalToBinary_m2(num/2);
			System.out.print(num%2);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int num = sc.nextInt();
				
		System.out.println(convertDecimalToBinary_m1(num));
		
		System.out.println("\n---------------");

		convertDecimalToBinary_m2(num);

	}

}
