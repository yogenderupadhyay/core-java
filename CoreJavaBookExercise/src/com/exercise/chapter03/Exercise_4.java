package com.exercise.chapter03;

import java.util.Scanner;

public class Exercise_4 {
	public void primeNumbers() {
		System.out.println("\n\t\t\t\t\t\t Exercise 3 \n\n");
		System.out.print("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int i,j;
		if(num>2)
		    System.out.print("prime numbers between 1 and "+num+" : ");
		else
			System.out.println("there is no prime number less than 2. Enter number greater than 2");
		for(i=2;i<=num;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0)
					break;
			}
			if(j==i)
				System.out.print(j+", ");
		}
	}
}
