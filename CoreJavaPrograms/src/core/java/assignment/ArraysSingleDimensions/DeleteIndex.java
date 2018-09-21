package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class DeleteIndex {
	int delete,array[],size,i;
	boolean flag;
	public void deleteIndex() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		size = sc.nextInt();
		array=new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter index to delete");
		delete=sc.nextInt();
		if(delete<size) {
				for(int j=delete;j<(size-1);j++) {
					array[j]=array[j+1];
				}
				flag=true;
		}
		if(flag=true) {
			System.out.println("Array after deleting index");
			for(int i : array){
				System.out.print(i+" ");
			}
		}
		else 
			System.out.println("index not found");
		
	}
}
