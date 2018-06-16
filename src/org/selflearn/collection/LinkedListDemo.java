package org.selflearn.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		
		l.add("durga");
		l.add("sss");
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		l.add(0, "venkey");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			String str=(String)itr.next();
			System.out.println(str);
		}

	}

}
