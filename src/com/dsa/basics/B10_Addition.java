package com.dsa.basics;

import java.util.Scanner;

/**
 * Space Complexity Example
 * 
 * Note: Space complexity is measured in abstract units (auxiliary space)
 * to ensure consistency across all programming languages.
 */

public class B10_Addition {

	// Method 1: Using intermediate variable
	// Time Complexity: O(1)
	// Auxiliary Space: O(1) - uses 1 extra variable 'sum'
	
	static int additionOfThreeNum_m1(int a,int b,int c) {
		
		int sum = a+b+c;
		return sum;
	}
	
	// Method 2: Direct return (no intermediate variable)
	// Time Complexity: O(1)
	// Auxiliary Space: O(1) - no extra variables used
	
	static int additionOfThreeNum_m2(int a,int b,int c) {
			
			return a + b + c;  
		}

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a value");
			int a = sc.nextInt();
			
			System.out.println("Enter b value");
			int b = sc.nextInt();
			
			System.out.println("Enter c value");
			int c = sc.nextInt();
			
			System.out.println(additionOfThreeNum_m1(a, b, c));
			System.out.println(additionOfThreeNum_m2(a, b, c));
		
	}

}
