package com.java.practice.string_operations;
import java.util.Scanner;

public class Concatenate {

	public void concatStrings() {
		String string_1, string_2, string_3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1 :- ");
		string_1=sc.nextLine();
		System.out.print("Enter String 2 :- ");
		string_2=sc.nextLine();
		string_3=string_1.concat(string_2);
		System.out.println("\n Concanated string is :- "+string_3);
	}
}
