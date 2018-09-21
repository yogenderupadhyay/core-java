package com.java.practice.Static;

public class Test {
	public static void main(String [] args)
	{
			ObjectCount s1=new ObjectCount();
			ObjectCount s2 = new ObjectCount();
			ObjectCount s3 = new ObjectCount();
			ObjectCount s4 = new ObjectCount();
			System.out.println("Number Of Objects Created = "+ObjectCount.count);
	}
}

