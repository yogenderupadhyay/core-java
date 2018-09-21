package com.java.practice;

import java.util.Scanner;

public class Factorial {
	void findFactorial() {
		double num, fact = 1;
		System.out.println("ENTER NUMBER TO FIND FACTORIAL");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 2; i <=num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
	}
}
