package org.selflearn.javafileio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		PrintWriter pw=new PrintWriter("d:\\xyz\\abc.txt");
		
		pw.write(100);
		pw.print('s');
		pw.print("viraj");
		pw.write("satish");
		pw.flush();
	}

}
