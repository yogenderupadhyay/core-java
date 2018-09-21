package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class Armstrong {
	public void checkArmstrong() {
		System.out.println("Enter number to check armstrong or not ");
		Scanner sc = new Scanner(System.in);
		int temp = 0, num, number = sc.nextInt();
		num = number;
		while (num > 0) {
			int rem = num % 10;
			temp = temp+rem * rem * rem;
			num = num / 10;
		}
		if (temp == number)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not an Armstrong number");
	}
}
