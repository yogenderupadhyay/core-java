package core.java.practice.collections;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public  void mainMenu(Person p,ArrayListClass list)
	{	
		System.out.println("*******************Main Menu******************** ");
			System.out.println("Enter :-");
			System.out.println("1 -> TO ADD OBJECT IN LIST");
			System.out.println("2 -> TO REMOVE OBJECT FROM LIST BY NAME");
			System.out.println("3 -> TO REMOVE OBJECT FROM LIST BY INDEX VALUE");
			System.out.println("4 -> TO SEARCH OBJECT FROM LIST BY INDEX VALUE");
			System.out.println("5 -> TO SEARCH OBJECT IN LIST BY NAME");
			System.out.println("6 -> TO DISPLAY OBJECT LIST");
			System.out.println("-----------------------------------------------");
		    System.out.println("select one no. from above as per your choice");
		    Scanner sc = new Scanner(System.in);
		    int choice=0;
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("\n\n"+sc.nextLine()+" is invalid option select valid option \n\n");
				 mainMenu(p,list);
			}
		    int c;
		    switch(choice) {
	    	case 1:	do {      
	    				p = new Person();					
	    				list.addObject(p);
	    				c=subMenu();
	    			}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;
			case 2: do {      
						p = new Person();					
						list.removeObject();
						c=subMenu();
					}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;
			case 3: do {      
						p = new Person();					
						list.removeIndex(); 
						c=subMenu();
					}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;	
			case 4: do {      
						p = new Person();					
						list.searchIndex(); 
						c=subMenu();
					}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;	
			case 5:do {      
						p = new Person();					
						list.searchName();
						c=subMenu();
					}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;
			case 6: do {      
						p = new Person();					
						list.display(); //ArrayList class method remove(index)
						c=subMenu();
					}while(c==1);
					if(c==2)
					mainMenu(p,list);
					break;
			default: System.out.println("\n\n invalid option select valid option \n\n");
					 mainMenu(p,list);
	    }
	}
	public int subMenu()
	{
		int c;
		boolean input=true;
	do {
		c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter :-");
		System.out.println("1 -> To Continue \n2 -> To go to main menu");
		try {
			c=sc.nextInt();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid input "+sc.nextLine()+" is not a valid input \n");
			input=true;
		}
		
	}while(input!=true || (c>3||c<=0));
	return c;
	}
}
