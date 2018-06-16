package org.selflearn.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(101, "a");
		h.put(102, "b");
		h.put(103, "c");
		System.out.println(h);
		
		System.out.println(h.get(101));
		
		Set s=h.keySet();
		System.out.println(s);
		
		Collection c=h.values();
		System.out.println(c);
		
		Set s1=h.entrySet();
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> e=(Entry<Integer, String>) itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
			if(e.getKey().equals(102))
			{
				e.setValue("pune");
			}			
			
		}
		
		System.out.println(h);
		
		
	}

}
