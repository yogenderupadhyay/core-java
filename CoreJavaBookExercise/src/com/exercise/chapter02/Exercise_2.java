package com.exercise.chapter02;

import java.util.Scanner;

public class Exercise_2 {
	final double pi=22/7; //constant
	double r; //Radious :- r
	double h; // height :- h
	public void calculateArea() {
		System.out.println("\t\t\t\t\t\tExercise 1");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radious (r) ");
		r=sc.nextDouble();
		System.out.print("\nEnter Height(h):");
		h=sc.nextDouble();
		double area=pi*r*r*h;
		System.out.print("\nArea of cylinder is is :"+area);
		
	}
}
