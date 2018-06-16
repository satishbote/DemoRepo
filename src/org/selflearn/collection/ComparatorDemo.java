package org.selflearn.collection;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Satish");
		Employee e2=new Employee(102,"Viraj");
		Employee e3=new Employee(103,"Durga");
		
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		System.out.println(t1);
		
		TreeSet t2=new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		
		System.out.println(t2);
		

	}

}
