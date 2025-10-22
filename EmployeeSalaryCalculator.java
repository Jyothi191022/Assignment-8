package com.codegnan.controlstatements;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter years of experience: ");
        double experience = sc.nextDouble();
        System.out.print("Enter performance score (0-10): ");
        double performanceScore = sc.nextDouble();
        double baseSalary;
        double bonus;
        if (experience < 2) {
            baseSalary = 30000;
        } else if (experience <= 5) {
            baseSalary = 50000;
        } else {
            baseSalary = 70000;
        }
        if (performanceScore >= 8) {
            bonus = baseSalary * 0.10;
        } else {
            bonus = 0;
        }
        double totalSalary = baseSalary + bonus;
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + totalSalary);
        sc.close();

	}

}
