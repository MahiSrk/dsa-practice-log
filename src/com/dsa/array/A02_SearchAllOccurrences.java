package com.dsa.array;

import java.util.Arrays;

//This program searches for a specified element in an array and returns all the indexes where that element occurs.

public class A02_SearchAllOccurrences {

	public static int [] searchAll(int[] arr, int element) {
		
		int cnt=0;
		for(int x:arr) {
			if(x==element) {
				cnt++; 
			}
		}
		
		int [] output = new int[cnt];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==element) {
					output[j] = i;
					j++;
			}
		}
		return output;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,7,8,9,5,7,5,4,8};
		int [] output = searchAll(arr,7);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
	
	}

}
