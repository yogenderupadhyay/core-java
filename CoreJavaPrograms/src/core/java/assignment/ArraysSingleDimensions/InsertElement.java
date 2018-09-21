package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class InsertElement {
	int size,array[],position;
	public InsertElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		array=new int [size+1];
		System.out.println("enter elements");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the position where you want to insert an element");
		position=sc.nextInt();
		for(int i=(size-1);i>(position-1);i--) {
			array[i+1]=array[i];
		}
		System.out.println("enter the element you want to insert at "+position);
		array[position-1]=sc.nextInt();
		System.out.println("array after inserting value");
		for(int i: array) {
			System.out.println(i+" ");
		}
	}

}
