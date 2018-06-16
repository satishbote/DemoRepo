package org.selflearn.string;

public class StringOccurance {

	public static void main(String[] args) {
		
		String str="abaac";
		char ch='a';
		int counter=0;
		
		for(int i=0; i<str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
				counter++;
		}
		
		System.out.println(counter);
		

	}

}
