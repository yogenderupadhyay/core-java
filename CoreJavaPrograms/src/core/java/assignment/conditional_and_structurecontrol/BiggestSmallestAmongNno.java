package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class BiggestSmallestAmongNno {
    public void biggestSmallestNo() {
		System.out.println("how many numbers you want to enter");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[] number=new int[size];
		
		for(int i=0;i<size;i++) {
				number[i]=sc.nextInt();
		}
		int largest=number[0], smallest=number[0];
		for(int i=0;i<size;i++) {
			if(number[i]>largest)
			{
				largest=number[i];
			}
			if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		System.out.println("Largest number among all numbers is "+largest+"\n smallest number among all numbers is "+smallest);
	}
}
