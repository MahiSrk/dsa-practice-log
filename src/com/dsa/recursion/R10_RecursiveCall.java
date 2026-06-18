package com.dsa.recursion;

public class R10_RecursiveCall {
	
	public static void goToHome(int x,int home) {
		//base case
		if(x==home) {
			System.out.println("Reached Home");
			return;
		}
	
	//recursive case
	System.out.println("Taking a step " + (x+1));
	goToHome(x+1,home);
	System.out.println("Coming back " +(x+1));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goToHome(0,5);
	}

}
