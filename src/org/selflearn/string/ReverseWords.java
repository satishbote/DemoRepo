package org.selflearn.string;

import java.util.regex.Pattern;

public class ReverseWords {

	public static void main(String[] args) {

		
		String str="Welcome to Java Programming";
		
		//Pattern p=Pattern.compile("\\s");
		
		//String[] words=p.split(str);
		
		String[] words=str.split("\\s");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i] + " ");
		}		
		
		
		/*String result="";
		for(int i=0;i<words.length;i++)
		{
			result = " " + words[i] + result;
		}
		System.out.println(result);*/
		
		
		
		
		
		
		
		
	}

}
