package com.dsa.basics;

import java.util.Scanner;
/*
Design and implement a Java program to calculate the monthly electricity bill based on slab rates.
 The program takes the number of units consumed as input and computes the total bill according to predefined pricing slabs,
 while also handling invalid inputs.

Accept user input for electricity consumption (in units)
Apply slab-based pricing rules:
1–100 units → ₹5 per unit
101–200 units → ₹7 per unit
201–300 units → ₹10 per unit
301–400 units → ₹12 per unit
401–500 units → ₹15 per unit
Validate input (reject negative or out-of-range values)
Display the final calculated bill amount
*/

public class B17_ElectricityBill {
	
	public static int calculateElectricityBill(int units) {
		
		int bill = 0;
			if (units <= 0 || units > 500) {
		        System.out.println("Invalid input");
		        return -1;
		    }
			if(units<=100) {
				bill = units * 5;
			}
			else if(units<=200) {
				bill = units - 100;
				bill = bill * 7 + 100 * 5;
			}
			else if(units<=300) {
				bill = units - 200;
				bill = bill * 10 + 100 * 7 + 100 * 5;
			}
			else if(units<=400) {
				bill = units - 300;
				bill = bill * 12 + 100 * 10 + 100 * 7 + 100 * 5;
			}
			else {
			    bill = (units - 400) * 15 + 100 * 12 + 100 * 10 + 100 * 7 + 100 * 5;
			}
			return bill;
		}
	
	
	public static int calculateElectricityBillOptimise(int units) {

	    if (units <= 0 || units > 500) {
	        System.out.println("Invalid input");
	        return -1;
	    }

	    int bill = 0;

	    if (units > 400) {
	        bill += (units - 400) * 15;
	        units = 400;
	    }
	    if (units > 300) {
	        bill += (units - 300) * 12;
	        units = 300;
	    }
	    if (units > 200) {
	        bill += (units - 200) * 10;
	        units = 200;
	    }
	    if (units > 100) {
	        bill += (units - 100) * 7;
	        units = 100;
	    }
	    if (units > 0) {
	        bill += units * 5;
	    }

	    return bill;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your monthly electricity consumption between 1 to 500");
		int Consumption = sc.nextInt();
		
		//System.out.println(calculateElectricityBill(Consumption));
		System.out.println(calculateElectricityBillOptimise(Consumption));
	}

}
