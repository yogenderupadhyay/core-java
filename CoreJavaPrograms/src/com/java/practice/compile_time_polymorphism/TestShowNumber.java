package com.java.practice.compile_time_polymorphism;

public class TestShowNumber {

	public static void main(String[] args) {
		ShowNumbers obj=new ShowNumbers();
		obj.display(10);
		obj.display(20,30);
		obj.display(10.5);
	}

}
