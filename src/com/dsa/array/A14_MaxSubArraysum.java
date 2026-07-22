package com.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

//  -3 -2 -6 -1 -7 -4
//-23
//-20
//-14
//-12
//-11
public class A14_MaxSubArraysum {
	
    public static int maxSubarraySum(int[] arr) {
        // Code here
//        int sum  = 0;
//        int neg;
//        for(int i = 0; i<arr.length; i++){
//
//            int temp= 0;
//
//            for(int j =i; j<arr.length;j++){
//                
//              temp = temp + arr[j];
//         //     System.out.println("temp: "+temp);
//            }
//            if(temp > sum){
//                sum = temp;
//            }
//            if(temp < 0){
//            	
//                neg = temp;
//  //              System.out.println("neg before: "+neg);
////                if(neg>temp){
////                    sum = neg;
////                }
//                sum = neg;
//   //             System.out.println("neg: "+neg);
//            }
//            
//        }
//        return sum;

        int maxSum = arr[0];
        int currentSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0; // reset only when it's less than zero
            }
        }
        
        return maxSum;
    
    	
    }
    
    
    public static int maxSubArraySumKedensAlgo(int arr[]) {
    	
    	int maxSum = arr[0];
    	int currentSum = arr[0];
    	
    	for(int i=1;i<arr.length;i++) {
    		
    		currentSum = Math.max(currentSum + arr[i],arr[i]);
    		
    		maxSum = Math.max(maxSum, currentSum);
    		
    	}
    	return maxSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");

		int size = sc.nextInt();
		
		System.out.println("Enter "+ size + " elements in array");
		int arr[] = new int [size];

		for(int i=0; i<size;i++) {
		
			arr[i] = sc.nextInt();
		
		}
		
		System.out.println(maxSubarraySum(arr));
		
		System.out.println("-------------------------below is kedens algo -------------------------");
		
		System.out.println(maxSubArraySumKedensAlgo(arr));
		
		}
	}

