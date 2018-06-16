package org.selflearn.regex;

public class Test {

	public static void main(String[] args) {
		
		String str="abcd_@1234";
		
		String str1=str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(str1);

	}
	
	

}
