package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter units consumed:");
		int units = scanner.nextInt();
		System.out.println("Are you a senior citizen? (yes/no): ");
		boolean isSenior = scanner.next().equalsIgnoreCase("yes");
		 double bill = 0;

	        if (units <= 100) {
	            bill = units * 1.5;
	        } else if (units <= 200) {
	            bill = 100 * 1.5 + (units - 100) * 2;
	        } else if (units <= 300) {
	            bill = 100 * 1.5 + 100 * 2 + (units - 200) * 3;
	        } else {
	            bill = 100 * 1.5 + 100 * 2 + 100 * 3 + (units - 300) * 5;
	        }

	        if (bill > 1000) {
	            bill += bill * 0.10;
	        }

	        if (isSenior) {
	            bill -= bill * 0.05;
	        }

	        System.out.println("Total electricity bill: ₹" + bill);

	        scanner.close();
	}

}
