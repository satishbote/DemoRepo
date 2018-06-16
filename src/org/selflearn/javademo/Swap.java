package org.selflearn.javademo;

public class Swap {

	public static void main(String[] args) {
		
		int a=10,b=20;
		int temp;
		System.out.println("Before swapping " +a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("using Third variable "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Without using third variable"+a+" "+b);

	}

}
