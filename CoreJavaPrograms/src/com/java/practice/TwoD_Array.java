package com.java.practice;

import java.util.Scanner;

public class TwoD_Array {
	static int rows,cols;
	static Scanner sc;
	static {
		System.out.println("Program to enter two dimensional Array");
		sc = new Scanner(System.in);
		System.out.println("\nEntetr no of rows :- ");
		rows = sc.nextInt();
		System.out.println("Enter no of colums :- ");
		cols = sc.nextInt();
	}
	
	int array[][] = new int[rows][cols];
	public void enterValues() {
		System.out.println("Enter values of array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print("\nenter value of array["+i+"]["+j+"] :- ");
				array[i][j]=sc.nextInt();
			}
		}
		
	}public void showData() {
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
