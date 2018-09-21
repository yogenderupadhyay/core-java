package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class RemoveDuplicate {
	int array[],size,count=0,i;
	public void removeDuplicate() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		array=new int[size];
		System.out.println("enter elements in in array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		while(i<size) {
				if(array[i]==array[i+1]) {
				size=size-1;
				for(int j=(i+1);j<(size);j++) {
					array[j]=array[j+1];
					//System.out.println(i);
				}
				}
				i++;
		}
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
}
