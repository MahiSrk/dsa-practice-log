package com.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class A09_BinarySerarch {
	
//	public static void binarySearch(int arr[],int key) {
//		int start=0;
//		int end=arr.length-1;
//	//	int mid = (start+end)/2;
//		int mid = (start+end)/2;
//		
//		while(start<=end) { 
//		
//		if(arr[mid]<key) {
//			start=mid+1;
//			mid = (start+end)/2;
//		}
//		else if(arr[mid]>key) {
//			end=mid-1;
//			mid = (start+end)/2;
//		}
//		/*else if(start == end) {
//			System.out.println("Element is not present");
//			} */
//		if(arr[mid]==key) {
//			System.out.println("your key "+ arr[mid] +" index number is " + (mid+1));
//			break;
//		}
//		 
//		}
//	}

	// better one then above
	public static void binarySearch(int arr[], int key) {

	    int start = 0;
	    int end = arr.length - 1;

	    while(start <= end) {

	        int mid = start + (end - start) / 2;

	        if(arr[mid] == key) {
	            System.out.println("Your key " + key +" found at index " + mid);
	            return;
	        }

	        else if(arr[mid] < key) {
	            start = mid + 1;
	        }

	        else {
	            end = mid - 1;
	        }
	    }

	    System.out.println("Element is not present");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		
		int arr [] = new int [size];
		
		System.out.println("Enter elements in an array");
		
		for(int i=0; i<arr.length; i++) {
				arr[i]= sc.nextInt(); 		
		}
		System.out.println("Enter element you want to search");
		int key = sc.nextInt();
		
		binarySearch(arr,key);
	}

}
