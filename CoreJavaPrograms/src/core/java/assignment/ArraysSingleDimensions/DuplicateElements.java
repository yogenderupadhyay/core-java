package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class DuplicateElements {
	int array[],size,count=0;
	public void duplicateElements() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		array=new int[size];
		System.out.println("enter elements in in array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<(size-1);i++) {
			for(int j=(i+1);j<size;j++) {
				if(array[i]==array[j]) {
				System.out.print("duplicate numbers are : ");
				System.out.println(+array[j]);
					count++;
				}
			}
			System.out.println("number of duplicate elements is "+ count);
		}
	}
}
