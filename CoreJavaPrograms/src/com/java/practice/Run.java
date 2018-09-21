package com.java.practice;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		int choice;
		boolean flag=true;
		while(flag) {
			System.out.println("ENTER ;");
			System.out.println("1 -> TO CHECK  PRIME NUMBER");
			System.out.println("2 -> TO FIND FACTORIAL OF A NUMBER");
			System.out.println("3 -> TO FIND FIBONACCI SERIES OF A NUMBER");
			System.out.println("4 -> TO FIND ARMSTRONG NUMBER");
			System.out.println("5 -> TO ENTER TWO DIME5NSIONAL ARRAY");
			System.out.println("6 -> TO FORM QUADRILATERAL FROM STARS");
			System.out.println("7 -> TO CHECK GIVEN STRING IS PALINDROME OR NOT");
			System.out.println("-----------------------------------------------");
		    System.out.println("select one no. from above as per your choice");
		    Scanner sc = new Scanner(System.in);
		    choice = sc.nextInt();
		    switch(choice) {
		    	case 1: PrimeNumber p = new PrimeNumber();
		    			p.checkNo();
		    			break;
		    	case 2: Factorial f =new Factorial();
        				f.findFactorial();
        				break;
		    	case 3: Fibonacci fib=new Fibonacci();
        				fib.findFibonacciSeries();
        				break;
		    	case 4: ArmstrongNumber aNo=new ArmstrongNumber();
		        		aNo.checkNo();
		        		break;
		    	case 5: TwoD_Array matrix = new TwoD_Array();
		    			matrix.enterValues();
		    			matrix.showData();
		        		break;
		    	case 6: //StarQuadrilateral s = new StarQuadrilateral();
		    			StarQuadrilateral.starQuadrilateral();
		    			break;
		    	case 7: CheckPalindrome obj=new CheckPalindrome();
	    			    obj.check();
	    			    break;
		    	default: System.out.println("invalid option");
		    }
		    String temp;
		    System.out.println("Enter y/Y to continue and press any key to exit");
		    temp = sc.next();
        	if(temp.equalsIgnoreCase("Y"))
        			flag= true;
        	else
        			flag= false;
		}
	}

}
