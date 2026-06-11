package com.dsa.array;

import java.util.Scanner;

public class A06_ArrayJailerPerfectSquare {

	public static void PerfectSquare(int n) {
		int i =1;
		while(i*i <= n) {
			System.out.print(i*i + " ");
			i=i+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rounds");
		int round = sc.nextInt();
		
		System.out.println("Open Doors: ");
		PerfectSquare(round);

	}

}
