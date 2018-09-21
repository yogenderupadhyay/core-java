package com.java.practice;

public class StarQuadrilateral {
 	
	public static void starQuadrilateral()
	{
	int i,j;
	for(i=0;i<4;i++)
	{
		for(j=0;j<6;j++)
		{
			if((i==1 || i==2 ) & (j==1 | j==2 | j==3 | j==4))
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
	}
	}
}
