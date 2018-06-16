package org.selflearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// https://beginnersbook.com/2014/08/java-regex-tutorial/
		//http://www.mkyong.com/regular-expressions/10-java-regular-expression-examples-you-should-know/
		// password  ((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})
		
		
		String str="AA a ZZZ AA CCC A";
		
		Pattern p=Pattern.compile("AA");
		Matcher m=p.matcher(str);
		
		while(m.find())
		{
			System.out.println("Found at "+m.start()+"_"+m.end());
		}
	}

}
