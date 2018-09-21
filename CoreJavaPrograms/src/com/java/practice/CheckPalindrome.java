package com.java.practice;
import java.util.Scanner;
public class CheckPalindrome {
	static String s;
	static{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING TO CHECK PALINDROME OR NOT");
		s=sc.next();
	}
	int i,n=s.length();
	boolean flag=true;
	
	public void check() {
		for(i=0;i<n/2;++i) {
		if(s.charAt(i)==s.charAt(n-1))
			flag=true;
		else
			flag=false;
		}
		if(flag)
			System.out.println(s+" is an Palindrome");
		else
			System.out.println(s+" is not an Palindrome");
	}
}
