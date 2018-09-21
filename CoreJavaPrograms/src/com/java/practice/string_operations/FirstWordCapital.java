package com.java.practice.string_operations;

import java.util.Scanner;

public class FirstWordCapital {
	String string;
	public FirstWordCapital() {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		string = sc.nextLine();
	}
	public void firstWordCapital() {
		String temp[] = string.split(" ");
		StringBuilder s = new StringBuilder();
		for(int i=0;i<temp.length;i++) {
			s.append(Character.toUpperCase(temp[i].charAt(0)));
			s.append(temp[i].substring(1));
			s.append(' ');
			s.toString();
			/*s += (temp[i].charAt(0)-32);
			System.out.println(string);*/
				}
		System.out.println(s);
	}
}
