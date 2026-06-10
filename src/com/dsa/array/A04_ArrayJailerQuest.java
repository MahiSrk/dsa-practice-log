package com.dsa.array;

import java.util.Arrays;

public class A04_ArrayJailerQuest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int N = 100;
//		int arr[] = new int [101];
//		
//		for(int round = 1; round <= N; round ++ ) {
//			
//			for(int i = round; i <= N; i = i+round) {
//				arr[i] = 1- arr[i];
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(arr));

		        int N = 100;
		        int arr[] = new int[101];

		        for(int round = 1; round <= N; round++) {

		            for(int i = round; i <= N; i = i + round) {
		                arr[i] = 1 - arr[i];
		            }

		        }

		        System.out.println("Open Doors:");

		        for(int i = 1; i <= N; i++) {
		            if(arr[i] == 1) {
		                System.out.print(i + " ");
		            }
		        }
	}

}
