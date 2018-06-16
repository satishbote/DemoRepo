package org.selflearn.demo;


public class TestDemo extends AbstractDemo implements InterfaceDemo{

	@Override
	public void display() {
		System.out.println("Hello...");
		
	}


	public static void main(String[] args){
		
		InterfaceDemo id=new TestDemo();
		id.display();
		AbstractDemo ad=new TestDemo();
		ad.display();
		
		
	}
}
