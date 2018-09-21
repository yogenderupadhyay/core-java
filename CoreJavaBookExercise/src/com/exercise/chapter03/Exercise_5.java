package com.exercise.chapter03;

import java.util.Scanner;

public class Exercise_5 {
	public void checkDivisibility() {
		System.out.println("\n\t\t\t\t\t\t Exercise 5 \n\n");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Divident :");
		int num1=sc.nextInt();
		System.out.print("\nEnter Divisor : ");
		int num2=sc.nextInt();
		if(num2==0)
			System.out.println("cannot divide "+num1+" by zero");
		if(num2!=0)
		System.out.println(num1+" divided by "+num2+" = "+num1/num2);
	}
}
