package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class FactOfNNos {
	public void fact() {
		System.out.println("Enter number to find factorial");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num = 1;
		while (num <= number) {
			int fact = 1;
			for (int i = 2; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("factorial of " + num + " is " + fact);
			num++;
		}
	}
}
