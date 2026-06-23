package com.dsa.array;

import java.util.Scanner;

public class A12_maxProfit {

	/*
	Stock Buy and Sell - Max one Transaction Allowed
	Last Updated : 31 Jan, 2026
	Given an array prices[] of non-negative integers, representing the prices of the stocks on different days, find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

	Note: Stock must be bought before being sold.

	Examples:

	Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
	Output: 8
	Explanation: Buy for price 1 and sell for price 9. 

	Input: prices[] = [7, 6, 4, 3, 1]
	Output: 0
	Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

	Input: prices[] = [1, 3, 6, 9, 11]
	Output: 10
	Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]
	 */

	
	

	    public static int maxProfit(int[] prices) {
	        // Code here
	        int buy = 0;   
	        for(int i= 0; i < prices.length-1;i++){
	            
	            for ( int j = i; j < prices.length-1; j++){
	            if(prices[i]<prices[j+1]){
	                if(prices[j+1] - prices[i] > buy)
	                buy =prices[j+1] -prices[i];
	                }
	            }

	        }
	        return buy;
	    }
	    
	    //optimise code
	    
	    public static int maxProfitOptimise(int[] prices) {
	    int minPrice = prices[0];

        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
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
		
		System.out.println(maxProfitOptimise(arr));
		
		}
}
