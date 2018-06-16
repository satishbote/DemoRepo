package org.selflearn.javademo;

import java.util.Scanner;

public class FlyodsTriangle {

	public static void main(String[] args) {
		
		int numOfRows, value;

		System.out.println("enter no of rows you want");
		
		Scanner sc=new Scanner(System.in);
		numOfRows=sc.nextInt();
		
		value=1;
		
		for(int i=1;i<=numOfRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
	}

}
