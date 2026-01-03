package com.dsa.recursion;

import java.util.Scanner;

public class R02_ProductOfTwoIntegers {

	static int product(int a, int b) {
		
        if (b == 0) {                  
            return 0;
        } else if (b > 0) {            
            return a + product(a, b - 1);
        } else {                        
            return -product(a, -b);
        }
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println(product(a,b));
	}

}
