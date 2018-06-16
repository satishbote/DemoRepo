package org.selflearn.javademo;

public class ReverseNumber {

	public static void main(String[] args) {

		
		int rem, rev=0,num=1234;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
		System.out.println(rev);
		
		if(rev==num)
			System.out.println("Number is plaindrome");
		else
			System.out.println("not plaindrome");
	}

}
