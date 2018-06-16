package org.selflearn.javademo;

public class SumOfDigits {

	public static void main(String[] args) {

		int rem,num=123,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of digits= "+sum);
	}

}
