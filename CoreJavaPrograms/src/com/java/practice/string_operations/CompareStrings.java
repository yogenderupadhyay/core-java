package com.java.practice.string_operations;

import java.util.Scanner;

public class CompareStrings {
	String string_1, string_2;
	CompareStrings(){
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first string String_1");
	  string_1=sc.next();
		System.out.println("Enter Second string String-2");
		string_2=sc.next();
	}
	public void compareStrings() {
		if(string_1.equals(string_2)) 
			System.out.println("string_1 and string_2 are equal");
		else
			System.out.println("string_1 and String-2 are not equal");
	}
}
