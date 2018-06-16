package org.selflearn.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		
		t.add(10);
		t.add(5);
		//t.add(5);
		System.out.println(t.add(5));
		System.out.println(t);
		
	}

}
