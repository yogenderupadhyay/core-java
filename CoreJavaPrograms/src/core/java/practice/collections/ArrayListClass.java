package core.java.practice.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListClass {
	List<Person> pList = new ArrayList<>();
	public void addObject(Person p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of person ");
		p.name = sc.next();
		System.out.println("Enter age of person");
		p.age= sc.nextInt();
		pList.add(p);
	}
	public void removeObject() {
		System.out.println("enter name you want to remove");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		boolean flag=true;
		for(Person p:pList) {
			if(p.name.equalsIgnoreCase(name)) {
				pList.remove(p);
				System.out.println("removed");
				flag = true;
				break;
				}
			else {
			flag=false;
			}
		}
		if(flag=false)
			System.out.println("not present in list");
	}
	public void removeIndex() {
		System.out.println("enter index you want to remove");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		try {
			pList.remove(index);
			System.out.println("removed");
		} catch (Exception e) {
			System.out.println("index number not present");
		}
	}
	public void searchIndex() {
		System.out.println("Enter index to search");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		try {
			System.out.println(pList.get(index).name);
		} catch (Exception e) {
			System.out.println("Index not present in list");
		}
	}
	public void searchName() {
		System.out.println("Enter name to search in list");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		boolean flag=true;
		for(Person p:pList) {
			if(p.name.equalsIgnoreCase(name)) {
				System.out.println("name : "+p.name+"\t age : "+p.age);
				flag = true;
				break;}
			else {
			flag=false;
			}
		}
		if(flag=false)
			System.out.println("not present in list");
	}
	public void display() {
		for(Person p:pList) {
			System.out.println("Name : "+p.name+"\tAge: "+p.age+"\n");
		}
	}

}
