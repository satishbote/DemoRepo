package org.selflearn.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsCount {
	
	public static void main(String[] args) {
		
		String str="Welcome to java java java programming";
		
		String[] str1=str.split("\\s");
		
		Map<String,Integer> m=new HashMap<>();
		
		Set<String> words = new HashSet<String>(Arrays.asList(str1));
		System.out.println(words);
		int count = 0;
		    for (String word : words) 
		    {
		        for (String temp : str1) 
		        {
		            if (word.equals(temp))
		            {
		                ++count;
		            }
		        }
		        m.put(word, count);
		        count = 0;
		    }		    
		    System.out.println(m);
		}		
	}

