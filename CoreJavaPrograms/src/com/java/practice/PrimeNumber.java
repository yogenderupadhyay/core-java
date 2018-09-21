package com.java.practice;
import java.util.Scanner;
public class PrimeNumber {
	public void checkNo() {
		int num,i;
		boolean flag=false;
		Scanner sc=   new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num % i ==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag=true)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is a prime number");
		}
	}

}
