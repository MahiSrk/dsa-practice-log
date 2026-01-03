package com.dsa.recursion;

import java.util.Scanner;

public class R04_ReverseOfNumber {
	
	static int reverseOfNum(int num, int len) {
		if(num==0) {
			return 0;
		}else {
			return((num%10)*(int)Math.pow(10, len-1))+reverseOfNum(num/10, len-1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number you want to reverse");
		String str = sc.nextLine();
		System.out.println(reverseOfNum(Integer.parseInt(str),str.length()));
		
	}

}
