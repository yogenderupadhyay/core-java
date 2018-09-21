package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class LinearSearch {
	int search,size,num[];
	public LinearSearch() {
		System.out.println("Enter size of list");
		Scanner sc= new Scanner(System.in);
		size = sc.nextInt();
		num=new int[size];
		System.out.println("Enter numbers in list");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
	}
	public void linearSearch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Search");
		search=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(num[i]==search) {
				System.out.println("number found :- num["+i+"]= "+num[i]);
				flag=true;}
		}
		if(!flag)
			System.out.println("Number not found");
			
	}
}
