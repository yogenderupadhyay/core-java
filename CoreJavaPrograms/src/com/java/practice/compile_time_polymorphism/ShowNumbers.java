package com.java.practice.compile_time_polymorphism;

public class ShowNumbers {
	void display(int num) {
		System.out.println("NUMBER IS "+num);
	}
	void display(int num1 , int num2) {
		System.out.println("TWO NUMBERS ARE "+num1+" "+num2);
	}
	void display(double num) {
		System.out.println("DOUBLE NUMBER IS "+num);
	}
}
