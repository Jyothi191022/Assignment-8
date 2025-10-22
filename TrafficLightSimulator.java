package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficLightSimulator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter light color (Green, Yellow, Red): ");
	        String light = sc.next();
	        System.out.print("Enter hour (0-23): ");
	        int hour = sc.nextInt();
	        String action;
	        if (light.equalsIgnoreCase("Green")) {
	            action = "Go";
	        } else {
	            if (light.equalsIgnoreCase("Red")) {
	                action = "Stop";
	            } else {
	                if (hour >= 6 && hour <= 18) {
	                    action = "Slow";
	                } else {
	                    action = "Stop";
	                }
	            }
	        }
	        System.out.println(action);
	        sc.close();

	}

}
