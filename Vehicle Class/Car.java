package com.vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Car extends Vehicle {
  char choice;
	String fuelType, transmission, numberOfDoors, value;

	HashMap<String, ArrayList<String>> carList = new HashMap<String, ArrayList<String>>();
  
  	public void addCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		car.model = input.next();
		
		if (!carList.containsKey(car.model)) {
			carList.put(car.model, new ArrayList<String>());

			System.out.print("Enter Colour: ");
			car.colour = input.next();
			carList.get(car.model).add(car.colour);

			System.out.print("Enter Type of Fuel: ");
			car.fuelType = input.next();
			carList.get(car.model).add(car.fuelType);

			System.out.print("Enter Transmission type: ");
			car.transmission = input.next();
			carList.get(car.model).add(car.transmission);

			System.out.print("Enter Number of Doors: ");
			car.numberOfDoors = input.next();
			carList.get(car.model).add(car.numberOfDoors);
		}
		else
			System.out.println("Entered Model aldready exists!");
		
	}
	
	public void displayCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		car.model = input.next();

		if (carList.containsKey(car.model)) {
			System.out.print("Colour is: ");
			System.out.println(carList.get(car.model).get(0));

			System.out.print("Type of Fuel is: ");
			System.out.println(carList.get(car.model).get(1));

			System.out.print("Transmission type is: ");
			System.out.println(carList.get(car.model).get(2));

			System.out.print("Number of Doors is: ");
			System.out.println(carList.get(car.model).get(3));
		}
		else
			System.out.println("Invalid Model name");

	}
	
	public void editCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		car.model = input.next();

		if (carList.containsKey(car.model)) {
			System.out.print("Do you want to edit colour?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new colour: ");
				value = input.next();
				carList.get(car.model).set(0, car.value);
			}

			System.out.print("Do you want to edit type of fuel?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new fuel type: ");
				value = input.next();
				carList.get(car.model).set(1, car.value);
			}

			System.out.print("Do you want to edit transmission type?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new transmission: ");
				value = input.next();
				carList.get(car.model).set(2, car.value);
			}

			System.out.print("Do you want to edit number of doors?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new number of doors: ");
				value = input.next();
				carList.get(car.model).set(3, car.value);
			}
		}
		else
			System.out.println("Invalid Model name");
	}
	
	public void removeCarDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		car.model = input.next();

		if (carList.containsKey(car.model)) {
			carList.remove(car.model);
			System.out.print("Data deleted");
		}
		else
			System.out.println("Invalid Model name");
	}
}
