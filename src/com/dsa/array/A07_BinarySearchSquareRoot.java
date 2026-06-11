package com.dsa.array;

import java.util.Scanner;

public class A07_BinarySearchSquareRoot {

//	public static void SqrRoot() {
//		int s = 0;
//		int n = 100;
//		int e = n;
//		int ans = 0;
//		int mid = 0;
//		while(s<=e) {
//			mid = (s+e)/2;
//			if (mid* mid<=n) {
//				ans=mid;
//				s=mid+1;
//		}else {
//			e=mid-1;
//		}
//		}
//		System.out.println(ans);
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SqrRoot();
//	}

	    public static int findSquareRoot(int n) {

	        int s = 0;
	        int e = n;
	        int ans = 0;

	        while(s <= e) {

	            int mid = s + (e - s)/2;

	            if(mid * mid <= n) {
	                ans = mid;
	                s = mid + 1;
	            }
	            else {
	                e = mid - 1;
	            }
	        }

	        return ans;
	    }

	    public static void openDoors(int n) {

	        int root = findSquareRoot(n);

	        System.out.println("Open Doors:");

	        for(int i = 1; i <= root; i++) {
	            System.out.print(i * i + " ");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = 100;

	        openDoors(n);

	        sc.close();
	}
}
	