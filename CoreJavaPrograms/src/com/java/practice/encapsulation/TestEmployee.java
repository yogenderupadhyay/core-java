package com.java.practice.encapsulation;

public class TestEmployee {
	public static void main(String[] args) {
	Employee emp1 = new Employee();
	emp1.setEmpId(101);
// here we cannot initialize variable empId directly like emp1.empId=101; it will give error because it is declared private
	emp1.setEmpName("yatin");
//	emp1.empName="yatin"; it will give error becouse variable empName is not visible from here it is declared  private
	System.out.println("ID : "+emp1.getEmpId()+"\nNAME : "+emp1.getEmpName());
	}
	
	

}
