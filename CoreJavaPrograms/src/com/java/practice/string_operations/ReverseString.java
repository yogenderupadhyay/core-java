package com.java.practice.string_operations;

import java.util.Scanner;

public class ReverseString {
	String string, rev="";
	public ReverseString() {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		string = sc.next();
	}
	public void reverseString(){
		StringBuilder s=new StringBuilder(string);
		System.out.println("String after reverse "+s.reverse());
		
		// following is the logic to reverse a string without using reverse method 
		/*for(int i=string.length()-1;i>=0;i--) {
			rev = rev+string.charAt(i);
		}
		System.out.println(rev);*/
	}
}
