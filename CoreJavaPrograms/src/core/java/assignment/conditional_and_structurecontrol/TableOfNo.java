package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class TableOfNo {
	public void table() {
	System.out.println("enter number to get table");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num+" * "+i+" = "+num*i);
	}
	}
}
