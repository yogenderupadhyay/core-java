package com.exercise.chapter02;

import java.util.Scanner;

public class Options {
	public void content() {
		System.out.println("*************************Chapter 02 Working With Operators***************************");
		System.out.println("Exercise 1 :");
		System.out.println("\t\tProgram to calculate total distance travelled by vehicle.Using following formula"
							+ "\n\t\tDistance = ut + (at^2)/2");
		System.out.println("Exercise 2 :");
		System.out.println("\t\tProgram to calculate volume of a ctlinder.Using following formula"
							+ "\n\t\tVolume = pi*r*r*h");
		System.out.println("Exercise 3 :");
		System.out.println("\t\tProgram to convert temperature from celsius to fahrenheit.Using following formula"
							+ "\n\t\tFahrenheit = Celsius * 9/5 +32 ");
		System.out.println("Exercise 4 :");
		System.out.println("\t\tProgram to perform bitwise AND, OR, NOT and XOR operations on the numbers 5and 9.");
		System.out.println("\t\t\t\t\t Aditional Exercise");
		System.out.println("Exercise 1 :");
		System.out.println("\t\tProgram to to dispaly the postfix values and prefix values of the given number, 5 by using increment operator ");
		System.out.println("Exercise 2 :");
		System.out.println("\t\tProgram to perform left shift and right shift operations for 2 by 2 bits. in addition perform unsigned rihgt shift for -2 by 24 bits");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.print("Select Your Choice :");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1: Exercise_1 ex1=new Exercise_1();
					ex1.calculateDistance();
					break;
			case 2: Exercise_2 ex2=new Exercise_2();
					ex2.calculateArea();
					break;
			case 3: Exercise_3 ex3=new Exercise_3();
					ex3.convertTofahrenheit();
					break;
			case 4: Exercise_4 ex4=new Exercise_4();
					ex4.bitwiseOperations();
					break;
			case 5: ADExercise_1 aDE1=new ADExercise_1();
					aDE1.values();
					break;
			case 6: ADExercise_2 aDE2=new ADExercise_2();
					aDE2.shiftOperations();
					break;
			default:System.out.print("\nInvalid Option");
	}
	}
}
