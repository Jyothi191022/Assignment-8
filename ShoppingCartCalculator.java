package com.codegnan.controlstatements;

import java.util.Scanner;

public class ShoppingCartCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter total cart amount: ₹");
        double total = sc.nextDouble();
        System.out.print("Festival season? (yes/no): ");
        boolean festival = sc.next().equalsIgnoreCase("yes");
        System.out.print("Premium member? (yes/no): ");
        boolean premium = sc.next().equalsIgnoreCase("yes");
        double discount = 0;
        if (total >= 10000) discount += total * 0.20;
        else if (total >= 5000) discount += total * 0.10;
        if (festival) discount += total * 0.05;
        if (premium) discount += 200;
        double finalAmount = total - discount;
        System.out.println("Total Price: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable: ₹" + finalAmount);

        sc.close();

	}

}
