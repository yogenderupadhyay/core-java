package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class BiggestSmallestNumber {
	int numbers,largest=0,smallest=0;
	int[] array;
	public BiggestSmallestNumber() {
		System.out.println("enter n numbers");
		Scanner sc = new Scanner(System.in);
		numbers=sc.nextInt();
		array=new int[numbers];
		for(int i=0;i<numbers;i++) {
			System.out.println((i+1)+" :- ");
			array[i]=sc.nextInt();
		}
	}
	public void biggestSmallestNumber() {
		largest=array[0];
		smallest=array[0];
		for(int i=0;i<numbers;i++) {
			if(array[i]>largest)
			{
				largest=array[i];
			}
			if(array[i]<smallest) {
				smallest=array[i];
			}
		}
		System.out.println("Largest number among all numbers is "+largest+"\n smallest number among all numbers is "+smallest);
	}
}

