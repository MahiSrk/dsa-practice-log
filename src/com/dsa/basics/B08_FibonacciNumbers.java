package com.dsa.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class B08_FibonacciNumbers {

	static ArrayList<Integer>getFibonacciNums(int n){
		
		int a,b,c;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		a = 0;
		b = 1;
		al.add(a);
		al.add(b);
		
		for(int i = 1; i<=n-2; i++) {
			
			c = a+b;
			al.add(c);
			a = b;
			b = c;	
		}
		return al;	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		int n = sc.nextInt();
		System.out.println(getFibonacciNums(n));
	}

}
