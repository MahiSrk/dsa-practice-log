package com.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

/*
Two Sum - Pair with Given Sum
Difficulty: EasyAccuracy: 30.61%Submissions: 578K+Points: 2Average Time: 20m
Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
*/


public class A11_TwoSum {
	
//	public static boolean twoSum(int [] arr, int target) {
//		
//		for(int i=0; i<arr.length-1;i++) {
//			
//			for(int j=i; j<arr.length-1;j++) {
//				if(arr[i] + arr[j+1] == target) {
//					return true;
//				}
//			}
//		}return false;
//		
//	}
	
	
	// didnt work on input 5,4,3,2,1
//	public static int[] sortArray(int arr[]) {
//	
//		for (int i = 0; i<arr.length-1;i++) {
//			
//			if(arr[i] > arr[i+1]) {
//				
//				arr[i+1] = arr[i]+arr[i+1];
//				arr[i] = arr[i+1]-arr[i];  
//				arr[i+1] = arr[i+1]-arr[i];
//				
//			}
//		}
//		return arr;
//		
//	}
	
	
	public static int[] sortArray(int arr[]) {

	    for(int i=0;i<arr.length-1;i++){

	        for(int j=0;j<arr.length-1-i;j++){

	            if(arr[j] > arr[j+1]){

	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }return arr;
	}
	
	

	public static boolean twoSumOptimise(int arr[],int target) {
		
		A11_TwoSum.sortArray(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target)
                return true;

            else if(sum < target)
                left++;

            else
                right--;
        }

        return false;
    
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of an array");
		 int size = sc.nextInt();
		 int arr [] = new int [size];
		 
		 System.out.println("Enter elements of an array");
		 
		 for(int i = 0; i<size;i++) {
			  arr[i] = sc.nextInt();
		 }
		 
		 System.out.println("Enter target Value");
		 int target = sc.nextInt();
		 
//		 System.out.println(twoSum(arr,target));
		 System.out.println(twoSumOptimise(arr,target));
		 
		 System.out.println(Arrays.toString(sortArray(arr)));
		 
	}

}
