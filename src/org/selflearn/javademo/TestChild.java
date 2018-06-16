package org.selflearn.javademo;

public class TestChild extends TestParent {
	
	public void m1()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		
		TestParent p=new TestParent();
		p.m1();
		
		TestChild c= new TestChild();
		c.m1();
		
		TestParent pc= new TestChild();
		pc.m1();
		

	}

}
