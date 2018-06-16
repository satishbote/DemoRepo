package org.selflearn.javademo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int num;
		
		
		System.out.println("Enter limit");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			boolean isPrime=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
				
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}
			
			
		}
		
		/*boolean isPrime=true;
		
		for(int i=2;i<num;i++)
		{			
			if(num%i==0)
			{
				isPrime=false;
				break;
			}		
				
		}
		
		if(isPrime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}*/
		
		
		
	}

}
