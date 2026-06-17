package com.dsa.array;

import java.util.Scanner;

public class A08_SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter "+ n + " elements");
		int arr[] = new int [n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements in an array is: " + sum);
	}

}
