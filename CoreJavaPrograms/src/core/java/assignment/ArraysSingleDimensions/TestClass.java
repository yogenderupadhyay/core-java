package core.java.assignment.ArraysSingleDimensions;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("Enter :-");
		System.out.println("1 -> TO Read 'N' numbers and display the same");
		System.out.println("2 -> To Find biggest and smallest number between given 'N' Number");
		System.out.println("3 -> To Write a program to search whether given numbers is present or not using linear search");
		System.out.println("4 -> To Write a program to search whether given numbers is present or not using binary search");
		System.out.println("5 -> To Write a program to insert a number at the given position");
		System.out.println("6 -> TO Write a program to delete the given number from the array");
		System.out.println("7 -> TO Write a program to delete the number in a given position from the array");
		System.out.println("8 -> To Write a program to count the duplicate number in a given array");
		System.out.println("9 -> To Write program to remove all the duplicate numbers in a given array");
		System.out.println("10-> TO Write a program to count occurrence of each number in a given array");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			ReadAndDisplay numbers=new ReadAndDisplay();
			numbers.readAnddisplay();
			break;
		case 2:
			BiggestSmallestNumber bsn=new BiggestSmallestNumber();
			bsn.biggestSmallestNumber();
			break;
		case 3:
			LinearSearch ls=new LinearSearch();
			ls.linearSearch();
			break;
		case 4:
			BinarySearch bs=new BinarySearch();
			bs.binarySearch();
			break;
		case 5:
			InsertElement ie=new InsertElement();
			break;
		case 6:
			DeleteElement de=new DeleteElement();
			de.deleteElement();
			break;
		case 7:
			DeleteIndex di=new DeleteIndex();
			di.deleteIndex();
			break;
		case 8:
			DuplicateElements duplicate=new DuplicateElements();
			duplicate.duplicateElements();
			break;
		case 9:
			RemoveDuplicate rd=new RemoveDuplicate();
			rd.removeDuplicate();
			
			break;
		case 10:
		
			break;
		default :
			System.out.println("Invalid Option");
			break;
		}
	}
}
