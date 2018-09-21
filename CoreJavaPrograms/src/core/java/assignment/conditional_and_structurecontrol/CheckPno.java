package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class CheckPno {
	public void check() {
		System.out.println("Enter number to check");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<number/2;i++) {
			if(number%i==0)
			{
				System.out.println(number+" is not prime");
				flag=false;
				break;
			}
			if(flag) {
				System.out.println(number+" is an prime number");
			}
		}
	}
}
