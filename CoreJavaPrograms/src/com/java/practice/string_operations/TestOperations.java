package com.java.practice.string_operations;

import java.util.Scanner;
public class TestOperations {
	public static void main (String[] args) {
		boolean flag =true;
		while(flag) {
		System.out.println("Enter :-");
		System.out.println("1->To compare to strings");
		System.out.println("2->To print a given string in reverse order");
		System.out.println("3->To check given string is palindrome or not");
		System.out.println("4->to find a  number of  words in a given string");
		System.out.println("5->To display first letter of each word as capital in a string");
		System.out.println("6->To find number of occurrence of each character in given string");
		System.out.println("7->To concatrnate two strings");
		System.out.println("enter your choice :-");
		Scanner scan= new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			CompareStrings cmp = new CompareStrings();
			cmp.compareStrings();
			break;
		case 2:
			ReverseString rs = new ReverseString();
			rs.reverseString();
			break;
		case 3:
			PalindromeString ps = new PalindromeString();
			ps.palindromeString();
			break;
		case 4:
			NoOfWords words = new NoOfWords();
			words.noOfWords();
			break;
		case 5:
			FirstWordCapital fwc = new FirstWordCapital();
			fwc.firstWordCapital();
			break;
		case 6:
			CountOccurencesOfChar count = new CountOccurencesOfChar();
			count.countOccurencesOfChar();
			break; 
		case 7:
			Concatenate con = new Concatenate();
			con.concatStrings();
			break;
		}
		String temp;
		System.out.println("Enter y or Y to continue any other key to exit");
		temp = scan.next();
		if(temp.equalsIgnoreCase("Y"))
			flag= true;
	    else
			flag= false;
	}
		System.out.println("<********************End Of Program*******************");
	}
}
