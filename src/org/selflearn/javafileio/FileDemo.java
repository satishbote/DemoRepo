package org.selflearn.javafileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 
		 * Display names of all files in given directory
		 * 
		 */

		File file=new File("C:/Users/SATISH/Downloads/QAS_Win64");
		
		String[] str=file.list();
		int count=0;
		
		for(String s:str)
		{
			File f1=new File(file,s);
			if(f1.isDirectory())
			{
				count++;
				System.out.println(s);
			}
		}
		
		System.out.println(count);
		
				
	}

}
