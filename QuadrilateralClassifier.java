package com.codegnan.controlstatements;

import java.util.Scanner;

public class QuadrilateralClassifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter four sides (a b c d): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String type;
        if (a == b && b == c && c == d) {
            type = "Square";
        } else {
            if (a == c && b == d) {
                type = "Rectangle";
            } else {
                type = "Other";
            }
        }
        System.out.println(type);
        sc.close();

	}

}
