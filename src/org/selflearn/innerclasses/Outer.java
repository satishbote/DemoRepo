package org.selflearn.innerclasses;

public class Outer {

	
	
	class Inner{
		
		public void m1()
		{
			System.out.println("m1 method from inner class");
		}
		
	}
	
	public void m2()
	{
		System.out.println("Accessing inner class code from outer class instance method");
		Inner i=new Inner();
		i.m1();
	}
	public static void main(String[] args)
	{
		Outer out=new Outer();
		Inner in=out.new Inner();
		in.m1();
		out.m2();
	}
	
}
