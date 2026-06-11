package com.dsa.array;

public class A07_BinarySearchSquareRoot {

	public static void SqrRoot() {
		int s = 0;
		int n = 100;
		int e = n;
		int ans = 0;
		int mid = 0;
		while(s<=e) {
			mid = (s+e)/2;
			if (mid* mid<=n) {
				ans=mid;
				s=mid+1;
		}else {
			e=mid-1;
		}
		}
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqrRoot();
	}

}
