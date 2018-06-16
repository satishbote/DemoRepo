package org.selflearn.javademo;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class RandomNumber {
	
	
	

	public static void main(String[] args) {
		
		
		
		/*Random r=new Random();
		for(int i=0;i<10;i++)
		{
			System.out.println(r.nextInt(10000));
		}*/
		
		
		final String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		int len=5;
		StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( str.charAt( rnd.nextInt(str.length()) ) );
		   System.out.println(sb.toString());

		
		

	}

}
