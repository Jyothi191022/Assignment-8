package com.codegnan.controlstatements;

import java.util.Scanner;
public class PerfectSquareChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Not Perfect Square");
        } else {
            double sqrt = Math.sqrt(n);
            if (sqrt == (int) sqrt) {
                System.out.println("Perfect Square");
            } else {
                System.out.println("Not Perfect Square");
            }
        }
        sc.close();

	}

}
