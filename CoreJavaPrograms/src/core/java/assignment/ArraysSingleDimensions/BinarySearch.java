package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class BinarySearch {
	int size, first, last, middle,temp=0, array[];

	public BinarySearch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		size = sc.nextInt();
		System.out.println("enter elements in array");
		array=new int[size];
		for (int i = 0; i< size; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}	
		}
		System.out.print("list of numbers in a ascending order :- ");
			for(int a : array) {
				System.out.print(a+" ");
			}
	}
	public void binarySearch() {
		int search;
		System.out.println("\nEnter the search value:");
		Scanner sc=new Scanner(System.in);
	      search = sc.nextInt();
	      first = 0;
	      last =size - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < search )
	           first = middle + 1;
	         else if ( array[middle] == search )
	         {
	           System.out.println(search + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(search + " is not found.\n");
	   }
}
