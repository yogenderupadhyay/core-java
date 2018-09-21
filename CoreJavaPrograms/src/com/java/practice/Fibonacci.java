package com.java.practice;

import java.util.Scanner;

public class Fibonacci {
	void findFibonacciSeries() {
		int k=0,a=1,b=1,num;
		System.out.println("ENTER NUMBER TO FIND FIBONACCI SERIES");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.print("1 1 ");
		while(k<num) {
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	}

}
