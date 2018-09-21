package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class DeleteElement {
	int delete,array[],size,i;
	boolean flag;
	public void deleteElement() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		size = sc.nextInt();
		array=new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter element to delete");
		delete=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(array[i]==delete) {
				for(int j=i;j<(size-1);j++) {
					array[j]=array[j+1];
				}
				flag=true;
				break;
			}
		}
		if(flag=true) {
			System.out.println("Array after deleting element");
			for(int i : array){
				System.out.print(i+" ");
			}
		}
		else 
			System.out.println("number not found");
		
	}
}
