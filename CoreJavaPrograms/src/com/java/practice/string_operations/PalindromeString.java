package com.java.practice.string_operations;

import java.util.Scanner;

public class PalindromeString {
	String string,reverse="";
	public PalindromeString() {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		string = sc.next();
	}
	public void palindromeString(){
		for(int i=string.length()-1;i>=0;i--) {
		reverse = reverse+string.charAt(i);
	}
	System.out.println(reverse);
		if(string.equals(reverse))
			System.out.println(string+" is an palindrome");
		else
			System.out.println(string+" is not an palindrome");
		
	}
}
