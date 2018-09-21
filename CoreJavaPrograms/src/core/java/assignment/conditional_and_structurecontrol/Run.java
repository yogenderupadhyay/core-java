package core.java.assignment.conditional_and_structurecontrol;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		System.out.println("Enter :-");
		System.out.println("1 -> To find smallest and biggest number among three numbers");
		System.out.println("2 -> To find smallest and biggest number among N numbers");
		System.out.println("3 -> To get table of any number");
		System.out.println("4 -> To get tables from 1to 10");
		System.out.println("5 -> To check a number is prime or not");
		System.out.println("6 -> To get prime numer between 2 and 100");
		System.out.println("7 -> To get factorial of any number");
		System.out.println("8 -> To get factorial of all no between given range");
		System.out.println("9 -> To check given number is pallindrome");
		System.out.println("10-> To check given number is armstrong or not");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			BiggestSmallestNumber bsn = new BiggestSmallestNumber();
			bsn.biggestAndSmallestNumber();
			break;
		case 2:
			BiggestSmallestAmongNno bs = new BiggestSmallestAmongNno();
			bs.biggestSmallestNo();
			break;
		case 3:
			TableOfNo table = new TableOfNo();
			table.table();
			break;
		case 4:
			TablesOneToTen table1 = new TablesOneToTen();
			table1.display();
			break;
		case 5:
			CheckPno checkPno = new CheckPno();
			checkPno.check();
			break;
		case 6:
			PnoFrom_2_To_100 pno = new PnoFrom_2_To_100();
			pno.display();
			break;
		case 7:
			Factorial fact = new Factorial();
			fact.fact();
			break;
		case 8:
			FactOfNNos factOfNNo = new FactOfNNos();
			factOfNNo.fact();
			break;
		case 9:
			Pallindrome checkPallindrome = new Pallindrome();
			checkPallindrome.checkPallindrome();
			break;
		case 10:
			Armstrong checkArmstrong = new Armstrong();
			checkArmstrong.checkArmstrong();
			break;
		default:
			System.out.println("invalid option");
		}
	}

}
