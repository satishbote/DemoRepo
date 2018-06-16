package org.selflearn.javafileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterReaderDemo {

	public static void main(String[] args) throws IOException {


		/*
		 * 
		 * Writing into file using FileWriter
		 * 
		 */
		
		/*
		FileWriter fw= new FileWriter("D:\\xyz\\abc.txt");
		
		fw.write("pune");
		
		char[] ch={'c','d','e'};
		fw.write(ch);
		fw.flush();
		fw.close();*/
		
		
		/*
		 * 
		 * Reading file using FileReader
		 * 
		 */
		
		File f=new File("D:\\xyz\\abc.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
