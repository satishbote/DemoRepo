package org.selflearn.javafileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws IOException {

		PrintWriter pw=new PrintWriter("d:\\xyz\\file3.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("d:\\xyz\\file1.txt"));
		
		String line=br.readLine();
		while(line!=null)
		{
			pw.write(line);
			line=br.readLine();
		}
		
		BufferedReader br1=new BufferedReader(new FileReader("d:\\xyz\\file2.txt"));
		
		String line1=br1.readLine();
		while(line1!=null)
		{
			pw.write(line1);
			line1=br1.readLine();
		}
		
		pw.flush();
		pw.close();
		br.close();
		br1.close();
	}

}
