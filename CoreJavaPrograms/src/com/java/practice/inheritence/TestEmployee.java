package com.java.practice.inheritence;

public class TestEmployee {
	public static void main(String[] args) {
		ContractEmployee cEmp=new ContractEmployee();
		cEmp.setName("yatin");
		cEmp.setAge(23);
		cEmp.setDureation(10);
		System.out.println("Details of contact employee");
		System.out.println("NAME : "+cEmp.getName()+"\nAGE : "+cEmp.getAge()+"\nDURATION : "+cEmp.getDureation());
		ParmanentEmployee pEmp=new ParmanentEmployee();
		pEmp.setName("amit");
		pEmp.setAge(23);
		pEmp.setPf(1000000);
		System.out.println("Details of parmanent employee");
		System.out.println("NAME : "+pEmp.getName()+"\nAGE : "+pEmp.getAge()+"\nDURATION : "+pEmp.getPf());
	}
}
