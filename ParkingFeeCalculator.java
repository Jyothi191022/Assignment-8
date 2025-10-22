package com.codegnan.controlstatements;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle type(Car, Bike, Truck):");
		String vehicle = sc.next().toLowerCase();
		System.out.print("Enter time of arrival (0-23): ");
        int arrival = sc.nextInt();

        System.out.print("Enter time of departure (0-23): ");
        int departure = sc.nextInt();
        int hours;
        if (departure >= arrival) {
            hours = departure - arrival;
        } else {
            hours = (24 - arrival) + departure;
        }
        double rate = 0;
        if (vehicle.equals("car")) rate = 50;
        else if (vehicle.equals("bike")) rate = 30;
        else if (vehicle.equals("truck")) rate = 100;
        double fee = hours * rate;
        if (hours > 5) {
            fee -= fee * 0.20; // 20% discount
        }
        boolean surcharge = false;
        for (int i = 0; i < hours; i++) {
            int currentHour = (arrival + i) % 24;
            if (currentHour >= 18 || currentHour < 8) {
                surcharge = true;
                break;
            }
        }
        if (surcharge) {
            fee += fee * 0.50;
        }
        System.out.println("Total parking fee: ₹" + fee);
        sc.close();
	}

}
