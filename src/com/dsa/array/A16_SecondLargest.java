package com.dsa.array;

public class A16_SecondLargest {


	    public static int findSecondLargest(int[] arr) {

	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array should contain at least two elements.");
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {

	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            throw new RuntimeException("Second largest element does not exist.");
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {

	        int[] arr = {12, 35, 1, 10, 34, 1};

	        int result = findSecondLargest(arr);

	        System.out.println("Second Largest Element: " + result);
	    }
}
	
