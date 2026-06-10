package com.dsa.array;

import java.util.Scanner;

public class A03_PrimeNumber {
	
	public static boolean isPrime(int n) {
		for(int i=2; i<= n-1; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeOptimise(int n) {
	for (int i=2; i*i <= n; i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
	
	public static void printPrimes(int a, int b) {
		for(int i=a; i<=b; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check wheather is prime or not");
		int n = sc.nextInt();
		boolean result = isPrime(n);

        if (result) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
		
        }
        
		System.out.println("Enter number to check wheather is prime or not");

        int n1 = sc.nextInt();
        boolean result1 = isPrimeOptimise(n1);

        if (result1) {
            System.out.println(n1 + " is a Prime Number");
        } else {
            System.out.println(n1 + " is Not a Prime Number");
		
        }
        
        System.out.println("Enter Value of A");
        int A = sc.nextInt();
        
        System.out.println("Enter value of B");
        int B = sc.nextInt();
	}    
}
