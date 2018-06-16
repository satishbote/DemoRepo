package org.selflearn.string;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="satish";
		
		char[] ch=str.toCharArray();
		
		/*for(char c:ch)
		{
			System.out.println(c);
		}*/
		System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

	}

}
