package org.selflearn.string;

public class StringDemo {

	public static void main(String[] args) {

		String str="Hi I am in Pune";
		
		String search="Pune";
		
		String [] str1=str.split("\\s");
		
		//System.out.println(str1);
		for(String s:str1)
		{
			
			//System.out.println(s);
			if(s.equals(search))
			{
				System.out.println(s);
			}
		}
	}

}
