package com.vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bike extends Vehicle {

	char choice;
	String value, type;

	HashMap<String, ArrayList<String>> bikeList = new HashMap<String, ArrayList<String>>();

	public void addBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		bike.model = input.next();
		
		if (!bikeList.containsKey(car.model)) {
			bikeList.put(bike.model, new ArrayList<String>());

			System.out.print("Enter Colour: ");
			bike.colour = input.next();
			bikeList.get(bike.model).add(bike.colour);

			System.out.print("Enter Type: ");
			bike.type = input.next();
			bikeList.get(bike.model).add(bike.type);
		}
		else
			System.out.println("Entered Model aldready exists!");
	}

	public void displayBikeDetails() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		bike.model = input.next();
		
		if (bikeList.containsKey(bike.model)) {

			System.out.print("Colour is: ");
			System.out.println(bikeList.get(bike.model).get(0));

			System.out.print("Type is: ");
			System.out.println(bikeList.get(bike.model).get(1));
		}
		else
			System.out.println("Entered Model does not exist");
	}

	public void editBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		bike.model = input.next();
		
		if (bikeList.containsKey(bike.model)) {
			System.out.print("Do you want to edit colour?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new colour: ");
				value = input.next();
				bikeList.get(bike.model).set(0, bike.value);
			}

			System.out.print("Do you want to edit type?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new type: ");
				value = input.next();
				bikeList.get(bike.model).set(1, bike.value);
			}
		}
		else
			System.out.println("Entered Model does not exist");
	}

	public void removeBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		bike.model = input.next();
		
		if (bikeList.containsKey(bike.model)) {
			bikeList.remove(bike.model);
			System.out.print("Data deleted");
		}
		else
			System.out.println("Entered Model does not exist");
	}
}
