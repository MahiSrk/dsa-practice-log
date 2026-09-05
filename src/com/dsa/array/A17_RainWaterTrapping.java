package com.dsa.array;

import java.util.Scanner;

/*
Given an array arr[] with non-negative integers representing the height of blocks.
If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.
*/

public class A17_RainWaterTrapping {
	
	static int maxWater(int arr[]) {

		 /*       int totalWater = 0;
		        
		        for(int i = 0; i < arr.length;i++){
		            int leftMax = 0;
		            int rightMax = 0;
		            
		            // max height on left
		            
		            for(int j=0;j<=i;j++){
		                leftMax=Math.max(leftMax,arr[j]);
		                
		            }
		             // max height on Right
		            
		            for(int j=i;j<arr.length;j++){
		                rightMax=Math.max(rightMax,arr[j]);
		                
		            }
		            
		           //calculte water at cuuent index
		           int water = Math.min(leftMax, rightMax) - arr[i];
		           
		           totalWater += water;
		        }
		       return totalWater;
		    */
		  
		  int left = 0;
		  int right = arr.length -1;
		  
		  int leftMax = 0;
		  int rightMax = 0;
		  
		  int water = 0;
		  
		  while(left < right){
		      
		      // when left side is smaller
		      
		      if(arr[left] <= arr[right]){
		          
		          if(arr[left]>=leftMax){
		              leftMax = arr[left];
		              
		          }else{
		              water += leftMax -arr[left];
		          }
		          left ++;
		      }
		      
		            // when right side is smaller
		      else{
		          
		          if(arr[right]>=rightMax){
		              rightMax = arr[right];
		              
		          }else{
		              water += rightMax -arr[right];
		          }
		          right --;
		      }
		      
		  }
		  
		  return water;
		  
		    }

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter building height:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Water stored is: " + maxWater(a));
   
	}
}
