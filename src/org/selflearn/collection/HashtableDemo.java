package org.selflearn.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable ht= new Hashtable();
		ht.put(101, "a");
		ht.put(102, "b");
		ht.put(103, "c");
		System.out.println(ht);
		
		Set s= ht.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry e= (Entry)itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		

	}

}
