package com.java.practice.string_operations;

import java.util.Scanner;

public class CountOccurencesOfChar {
	String string;
	public CountOccurencesOfChar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		string =sc.nextLine();
	}
	public void countOccurencesOfChar() {
		StringBuilder s=new StringBuilder(string);
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<string.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count=count+1;
					s.deleteCharAt(j);
				}
			}
		System.out.println("count of "+string.charAt(i)+" is "+count);
		}
	}
	}

