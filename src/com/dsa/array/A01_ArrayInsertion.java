package com.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class A01_ArrayInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of an array");
		int size = sc.nextInt();
		
		System.out.println("Enter " + size + " Elements");  
		
		int [] arr = new int[size+1];
		for(int i=0; i<size; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		//print

		System.out.println("--------------------------------------");
		
		System.out.println("At which position you want to enter an element");
		int pos = sc.nextInt();
		if (pos > size+1 || pos < 0) {
			System.out.println("Number must be between 1 to " + (size+1));
			return;
		}
		System.out.println("Enter element you want to add");
		int y = sc.nextInt();

		
		for(int i=0; i<=size-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		// Shifting
		for(int i=size-1; i>=pos-1; i--) {
			arr[i+1] = arr[i];
		}
		// overwrite the element at pos
		
		arr[pos-1]=y;
		
		//print
		System.out.println(Arrays.toString(arr));
	}

}
