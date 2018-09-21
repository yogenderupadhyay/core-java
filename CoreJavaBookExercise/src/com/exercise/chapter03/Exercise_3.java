package com.exercise.chapter03;

import java.util.Scanner;

public class Exercise_3 {
	public void check() {
		System.out.println("\n\t\t\t\t\t\t Exercise 3 \n\n");
		System.out.print("Enter Character : ");
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println(c+" is vowel");
		else
			System.out.println(c+" is not a vowel");
		
	}
}
