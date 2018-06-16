package org.selflearn.javafileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) throws IOException {

		/*FileWriter fw= new FileWriter("d:\\xyz\\abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Satish");
		bw.newLine();
		bw.write(100);
		bw.write("100");
		bw.flush();*/
		
		FileReader fr=new FileReader("d:\\xyz\\abc.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str=br.readLine();
		
		while(str!=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		
		
	}

}
