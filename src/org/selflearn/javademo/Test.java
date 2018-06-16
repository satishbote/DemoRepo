package org.selflearn.javademo;

public class Test {
	
	String name;
	Test(String name)
	{
		this.name=name;
		
	}
	/*
	public String toString()
	{
		return name;
	}*/

	public static void main(String[] args) {
		
		/*String s=new String("satish");
		System.out.println(s);*/
		
		Test t1=new Test("satish");
		System.out.println(t1);
		Test t2=new Test("Viraj");
		System.out.println(t2);
		

		
	}

}
