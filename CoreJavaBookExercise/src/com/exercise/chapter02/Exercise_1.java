package com.exercise.chapter02;
import java.util.Scanner;

public class Exercise_1 {
double u; //intial velocity :- u
double a; //accelaration :- a
double t; // time :- t
public void calculateDistance() {
	System.out.println("\t\t\t\t\t\tExercise 1");
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter initial velocity of vehicle(u): ");
	u=sc.nextDouble();
	System.out.print("\nEnter Acceleration(a) of vehicle:");
	a=sc.nextDouble();
	System.out.print("\nEnter Time(t) Taken by vehicle:");
	t=sc.nextDouble();
	double d=(u*t) + (a*t*t)/2;
	System.out.print("\nDistence travelled by vehicle is :"+d+"meters");
	
}
}
