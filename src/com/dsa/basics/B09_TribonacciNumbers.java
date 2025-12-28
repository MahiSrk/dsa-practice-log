package com.dsa.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class B09_TribonacciNumbers {
	
	static ArrayList<Integer>getFibonacciNums(int n){
			
			int a,b,c,d;
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			a = 0;
			b = 1;
			c = 2;
			al.add(a);
			al.add(b);
			al.add(c);
			
			for(int i = 1; i<=n-3; i++) {
				
				d = a+b+c;
				al.add(d);
				a = b;
				b = c;	
				c = d;
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
