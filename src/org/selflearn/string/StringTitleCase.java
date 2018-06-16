package org.selflearn.string;

public class StringTitleCase {
	public static void main(String[] args) {
		String str="satish bote pimpalgaon";		
				
		String[] words=str.split("\\s");
		for(String s:words)
		{
			String str1=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase()+" ";
			System.out.print(str1);			
		}
		
		/*String toggled="";
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(c.isUpperCase(str.charAt(i)))
			{
				c=Character.toLowerCase(str.charAt(i));
				toggled=toggled+c;
			}
			else if(c.isLowerCase(str.charAt(i)))
			{
				c=Character.toUpperCase(str.charAt(i));
						toggled=toggled+c;
			}

		}
		System.out.println(toggled);*/
	}

}
