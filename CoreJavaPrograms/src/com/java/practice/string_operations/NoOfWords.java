package com.java.practice.string_operations;

import java.util.Scanner;

public class NoOfWords {
		String string;
		public NoOfWords() {
			System.out.println("Enter a string");
			Scanner sc=new Scanner(System.in);
			string = sc.nextLine();
		}
		public void noOfWords() {
			int count = string.length();
			for(int i =0;i<string.length();i++) {
				if(string.charAt(i)==' ')
					count=count-1;
			}
			System.out.println("number of words in string are :- "+ count);
		}
}
