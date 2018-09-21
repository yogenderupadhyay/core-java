package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class Pallindrome {
	public void checkPallindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check pallindrome");
		int temp = 0,num,number=sc.nextInt();
		num=number;
		while(num>0) {
			int rem=num%10;
			temp=temp*10+rem;
			num=num/10;
		}
		if(temp==number)
			System.out.println(number +" is pallindrome number");
		else
			System.out.println(number+" is not an Pallindrome number");
	}
}
