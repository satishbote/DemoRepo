package org.selflearn.collection;

public class Employee implements Comparable {
	
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}

	@Override
	public int compareTo(Object obj) {
		
		int id1=this.id;
		
		Employee e=(Employee)obj;
		int id2=e.id;
		
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else
			return 0;
	}

}
