package com.exercise.chapter02;
import java.util.Scanner;

public class Exercise_3 {
	Double celsius, fahrenheit;
	public Exercise_3() {
		System.out.println("\t\t\t\t\t\tExercise 1");
		System.out.print("\nEnter tempereture in Celcsius :");
		Scanner sc=new Scanner(System.in);
		celsius=sc.nextDouble();
	}
	public void convertTofahrenheit() {
		fahrenheit=celsius * 9/5 + 32;
		System.out.print("\nTemperature in fahrenheit ="+fahrenheit);
	}
}
