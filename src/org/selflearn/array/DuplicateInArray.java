
package org.selflearn.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {

		
		/*String [] str={"satish", "sachin", "viraj", "satish"};
		
		Set<String> s= new HashSet<String>();
		
		for(String str1:str)
		{
			if(s.add(str1)==false)
			{
				System.out.println("duplicate string= "+str1);
			}
		}*/
		
		
		int [] arr={10,20,30,20,10};
		
		Set<Integer> s= new HashSet<Integer>();
		for(int arr1:arr)
		{
			if(s.add(arr1)==false)
			{
				System.out.print(arr1+" ");
			}
		}
	}

}
