package com.java.practice;
import java.util.Scanner;
public class ArmstrongNumber {
	void checkNo() {
		int num,sum=0;
		System.out.println("ENTER TO CHECK THAT NUMBER IS ARMTRONG OR NOT");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while(temp>0) {
			int rem = temp%10;
			sum +=rem*rem*rem;
			temp = temp/10;
		}
		if(num==sum)
			System.out.println(num+" is an ARMSTRONG NUMBER");
		else
			System.out.println(num+" is not an ARMTSTONG NUMBER");
	}
}
