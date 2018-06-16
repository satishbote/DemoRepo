package org.selflearn.string;

import java.util.regex.Pattern;

public class StringSplit {

	public static void main(String[] args) {
		String str="org.ejagruti.investcorp.modules.LaunchApp";
		
		String lastToken = str.split(Pattern.quote("."))[str.split(Pattern.quote(".")).length-1];
		System.out.println(lastToken);
		
		
		/*
		String[] parts = str.split(Pattern.quote("."));
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
		
		System.out.println(parts[4]);
		*/
	}

}

