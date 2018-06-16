package org.selflearn.javademo;

public class FactorialRec {

	public static void main(String[] args) {

		int result;
		
		result=factorial(5);
		System.out.println("Factorial= "+result);
	}
	
	static int factorial(int num)
	{
		if(num==1)
		{		
			return 1;
		}
		else
			
			return(num*factorial(num-1));
		
		
	}

}
