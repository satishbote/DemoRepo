package org.selflearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {

		String email="^[\\w\\.-]+@([a-z]+\\.)+[a-z]{2,3}$";
		
		Pattern p=Pattern.compile(email);
		
		Matcher m=p.matcher("satish122bote@gmail.com");
		
		if(m.matches())
		{
			System.out.println("correct");
		}
		
		
		String mobile="^((091)|(\\+91)|0?)[789]\\d{9}$";
		
		Pattern p1=Pattern.compile(mobile);
		
		Matcher m1=p1.matcher("+919890985045");
		
		if(m1.matches())
		{
			System.out.println("correct mobile");
		}
		
	}

}
