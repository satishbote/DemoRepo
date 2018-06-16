package org.selflearn.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(45);
		al.add(6);
		al.add(89);
		al.add(1);
		
		System.out.print(al);
		
		Collections.sort(al);
		
		//System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println(al);
		
}
}

