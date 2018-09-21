package com.exercise.chapter02;
import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			Options run =new Options();
			run.content();
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("\nPress Y to continue and press any key to exit");
		Scanner sc=new Scanner(System.in);
		String temp=sc.next();
		if(!temp.equalsIgnoreCase("y"))
			flag=false;
		}
		System.out.println("*********************************program end*********************************");
	}
}
