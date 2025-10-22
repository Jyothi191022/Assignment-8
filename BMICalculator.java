package com.codegnan.controlstatements;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (meters): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else {
            if (bmi <= 24.9) {
                category = "Normal";
            } else {
                if (bmi <= 29.9) {
                    category = "Overweight";
                } else {
                    category = "Obese";
                }
            }
        }
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);
        sc.close();

	}

}
