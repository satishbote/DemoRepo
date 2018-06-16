package org.selflearn.javademo;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in your pyramid");
		int noOfRows=sc.nextInt();
		
		int rowCount=1;
		
		for(int i=noOfRows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
