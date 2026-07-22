package com.dsa.array;

import java.util.Scanner;

// Given an array of N elements count the no of elements having atleast
// 1 element greater than itself

public class A15_CountNumberOfGreaterElements {

	static int count = 0;
	static int  countNumberOfGreaterElements(int arr[]) {
	
		for(int i =0; i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
			if(arr[j]>arr[i]) {
				count++;
			}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println(countNumberOfGreaterElements(arr)); 
	}

}
