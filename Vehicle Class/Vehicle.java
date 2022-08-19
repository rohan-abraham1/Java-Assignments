package com.vehicle;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Vehicle {
	String colour, model;
	
	static Bike bike = new Bike();
	static Car car = new Car();

	public Vehicle() {}
  
 	public static void main(String[] args) {
		char choice;
		int n, m;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\nInput 1 to access cars");
			System.out.println("Input 2 to access bikes");
			System.out.println("Press any other key to exit");
			n = input.nextInt();
			System.out.println("1. Add new data");
			System.out.println("2. Display data");
			System.out.println("3. Edit existing data");
			System.out.println("4. Delete data");
			m = input.nextInt();
			switch (n) {
			case (1):
				switch (m) {
				case (1):
					car.addCarDetails();
					break;
				case (2):
					car.displayCarDetails();
					break;
				case (3):
					car.editCarDetails();
					break;
				case (4):
					car.removeCarDetails();
					break;
				}
				break;
			case (2):
				switch (m) {
				case (1):
					bike.addBikeDetails();
					break;
				case (2):
					bike.displayBikeDetails();
					break;
				case (3):
					bike.editBikeDetails();
					break;
				case (4):
					bike.removeBikeDetails();
					break;
				}
				break;
			}
		} while (n == 1 || n == 2);
	}
