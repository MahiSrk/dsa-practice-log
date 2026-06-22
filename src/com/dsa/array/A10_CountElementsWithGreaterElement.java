package com.dsa.array;

public class A10_CountElementsWithGreaterElement {
	 public static int countElements(int arr[]) {

	        if(arr.length == 0)
	            return 0;

	        // Find maximum
	        int max = arr[0];

	        for(int i = 1; i < arr.length; i++) {

	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        // Count elements smaller than max
	        int count = 0;

	        for(int i = 0; i < arr.length; i++) {

	            if(arr[i] < max) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        int arr[] = {3, 1, 2, 4};

	        System.out.println(
	            countElements(arr)
	        );
	    }
}
