package com.vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Car extends Vehicle {
  char choice;
	String fuelType, transmission, numberOfDoors;

	HashMap<String, ArrayList<String>> carList = new HashMap<String, ArrayList<String>>();
  
  	public void addCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();
		
		if (!carList.containsKey(car.model)) {
			carList.put(model, new ArrayList<String>());

			System.out.print("Enter Colour: ");
			colour = input.next();
			carList.get(model).add(colour);

			System.out.print("Enter Type of Fuel: ");
			car.fuelType = input.next();
			carList.get(model).add(fuelType);

			System.out.print("Enter Transmission type: ");
			car.transmission = input.next();
			carList.get(model).add(transmission);

			System.out.print("Enter Number of Doors: ");
			car.numberOfDoors = input.next();
			carList.get(model).add(numberOfDoors);
		}
		else
			System.out.println("Entered Model aldready exists!");
		
	}
	
	public void displayCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();

		if (carList.containsKey(car.model)) {
			System.out.print("Colour is: ");
			System.out.println(carList.get(model).get(0));

			System.out.print("Type of Fuel is: ");
			System.out.println(carList.get(model).get(1));

			System.out.print("Transmission type is: ");
			System.out.println(carList.get(model).get(2));

			System.out.print("Number of Doors is: ");
			System.out.println(carList.get(model).get(3));
		}
		else
			System.out.println("Invalid Model name");

	}
	
	public void editCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();

		if (carList.containsKey(model)) {
			System.out.print("Do you want to edit colour?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new colour: ");
				colour = input.next();
				carList.get(model).set(0, colour);
			}

			System.out.print("Do you want to edit type of fuel?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new fuel type: ");
				fuelType = input.next();
				carList.get(model).set(1, fuelType);
			}

			System.out.print("Do you want to edit transmission type?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new transmission: ");
				transmission = input.next();
				carList.get(model).set(2, transmission);
			}

			System.out.print("Do you want to edit number of doors?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new number of doors: ");
				numberOfDoors = input.next();
				carList.get(model).set(3, numberOfDoors);
			}
		}
		else
			System.out.println("Invalid Model name");
	}
	
	public void removeCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();

		if (carList.containsKey(model)) {
			carList.remove(model);
			System.out.print("Data deleted");
		}
		else
			System.out.println("Invalid Model name");
	}
}
