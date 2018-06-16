package org.selflearn.javademo;

import java.util.Scanner;

public class FibonassiDemo {

	public static void main(String[] args) {
		
		int num,first,second,next;
		
		System.out.println("Enter number\n");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		first=0;
		second=1;
		
		for(int i=0;i<num;i++)
		{
			System.out.print(first+" ");
			next=first+second;
			first=second;
			second=next;
		}

	}

}
