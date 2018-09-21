package core.java.assignment.conditional_and_structurecontrol;
import java.util.Scanner;
public class Factorial {
	public void fact() {
		int fact=1;
		System.out.println("Enter number to find factorial");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=2;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+number+" is "+fact);
	}
}
