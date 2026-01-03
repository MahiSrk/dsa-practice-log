package com.dsa.basics;

import java.util.Scanner;

public class B12_SumOfArrayElements {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Elements in the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " elements");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		// By for-each Loop
		/* 
		 * int sum = 0;
		 * for(int num : arr) {
		 * 	  sum += num; 
		 * }
		 */
		// By for Loop
		int sum = 0;
		for (int i = 0; i < size; i++) {
		    sum += arr[i];
		}

		System.out.println("Sum of array elements is: " + sum);
	}

}
