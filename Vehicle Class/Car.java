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
}
