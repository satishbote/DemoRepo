package org.selflearn.innerclasses;

public class OuterWithStaticInner {
	
	
	
	static class Inner{
		
		public static void main(String args[])
		{
			System.out.println("Static nested inner class main method");
		}
	}
	
	
	public static void main(String[] args){
		System.out.println("outer class main method");
	}

}
