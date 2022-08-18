//Java Calculator Program with error handling
package com.orthofx;
import java.util.Scanner;

public class CalculatorWithHandling {
	
		static void add(int n1, int n2) {
			System.out.println("Sum = " + (n1+n2));
		}
		
		static void sub(int n1, int n2) {
			System.out.println("Difference = " + (n1-n2));
		}
		
		static void mul(int n1, int n2) {
			System.out.println("Multiply = " + (n1*n2));
		}
		
		static void div(int n1, int n2) {
			try {
				System.out.println("Division = " + (n1/n2));
			} catch (ArithmeticException e) {
				System.out.println("Cannot Divide by zero");
			}
		}
	
		public static void main (String[] args) {
			System.out.println("Java program to perform arithmetic operator on  2 numbers");
			Scanner input = new Scanner(System.in);
			char dw;
			do {
				System.out.println("Enter the 2 numbers:");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				try {
					System.out.println("Enter an operator to perform (+,-,*,/):");
					char op = input.next().charAt(0);
					switch(op) {
						case '+':add(num1,num2);
								break;
						case '-':sub(num1,num2);
								break;
						case '*':mul(num1,num2);
								break;
						case '/':div(num1,num2);
								break;
						default:
						      throw new InvalidAttributeValueException();
					}
				}  catch(InvalidAttributeValueException e) {
					System.out.println("Invalid Operator");
				}
				System.out.println("Do you want to repeat?(Y/N):");
				dw = input.next().charAt(0);
			}
			while(dw == 'Y' || dw == 'y');
			input.close();
		}
}
