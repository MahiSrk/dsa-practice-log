package com.dsa.recursion;

import java.util.Scanner;

public class R08_LCMOfTwoNumbers {
	
	static int commonMultiple = 1;
	
	static int lcmOfNumber(int num1, int num2) {
		if(commonMultiple % num1 == 0 && commonMultiple % num2 == 0) {
			return commonMultiple;
		}else {
				commonMultiple ++;
				lcmOfNumber(num1, num2);
				return commonMultiple;
		}		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 value");
		int n1 = sc.nextInt();
		
		System.out.println("Enter num2 value");
		int n2 = sc.nextInt();
		
		System.out.println(lcmOfNumber(n1,n2));
	}

}
