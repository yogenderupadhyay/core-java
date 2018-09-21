package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class ReadAndDisplay  {
	int size=0;
	int num[];
	Scanner sc = new Scanner(System.in);
	public ReadAndDisplay() {
		System.out.println("enter size of array");
		size = sc.nextInt();
		num = new int[size];
		for(int i = 0;i<size;i++) {
			System.out.println("enter value["+i+"]");
			num[i]=sc.nextInt();
		}
	}
		public void readAnddisplay() {
			System.out.println("Numbers in Array are :-");
			for(int n:num){
				System.out.print(n+" ");
			}
		}
}
