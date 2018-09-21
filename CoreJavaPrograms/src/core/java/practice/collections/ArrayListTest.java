package core.java.practice.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest {
	public static void main(String[] args) {
		Person p;
		ArrayListClass list = new ArrayListClass();
		p=new Person("rajat",25);
		list.pList.add(p);
		p=new Person("nishant",22);
		list.pList.add(p);
		p=new Person("rahul",23);
		list.pList.add(p);
		p=new Person("vaibhav",25);
		list.pList.add(p);
		boolean flag=true;
		while(flag) {
		p.mainMenu(p,list);
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter END key to the program");
			String temp = sc.next();
			if(temp.equalsIgnoreCase("end"))
				flag=false;
		}
		
	}
	
	
}
