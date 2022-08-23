package com.vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bike extends Vehicle {

	char choice;
	String type;

	HashMap<String, ArrayList<String>> bikeList = new HashMap<String, ArrayList<String>>();

	public void addBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();
		
		if (!bikeList.containsKey(model)) {
			bikeList.put(model, new ArrayList<String>());

			System.out.print("Enter Colour: ");
			colour = input.next();
			bikeList.get(model).add(colour);

			System.out.print("Enter Type: ");
			type = input.next();
			bikeList.get(model).add(type);
		}
		else
			System.out.println("Entered Model aldready exists!");
	}

	public void displayBikeDetails() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();
		
		if (bikeList.containsKey(model)) {

			System.out.print("Colour is: ");
			System.out.println(bikeList.get(model).get(0));

			System.out.print("Type is: ");
			System.out.println(bikeList.get(model).get(1));
		}
		else
			System.out.println("Entered Model does not exist");
	}

	public void editBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();
		
		if (bikeList.containsKey(bike.model)) {
			System.out.print("Do you want to edit colour?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new colour: ");
				colour = input.next();
				bikeList.get(model).set(0, colour);
			}

			System.out.print("Do you want to edit type?(Y/N): ");
			choice = input.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.print("Enter new type: ");
				type = input.next();
				bikeList.get(model).set(1, type);
			}
		}
		else
			System.out.println("Entered Model does not exist");
	}

	public void removeBikeDetails() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Model Name: ");
		model = input.next();
		
		if (bikeList.containsKey(model)) {
			bikeList.remove(model);
			System.out.print("Data deleted");
		}
		else
			System.out.println("Entered Model does not exist");
	}
}
