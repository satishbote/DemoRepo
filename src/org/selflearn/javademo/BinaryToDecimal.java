package org.selflearn.javademo;

public class BinaryToDecimal {

	public static void main(String args[]){  
		
		/*String binary="1010";  		
		int decimal=Integer.parseInt(binary,2);  
		System.out.println(decimal);*/ 
		
		int binary=1010;
		int decimal=0;
		int n=0;
		 while(true){  
		      if(binary == 0){  
		        break;  
		      } else {  
		          int temp = binary%10;  
		          System.out.println("temp "+temp);
		          decimal += temp*Math.pow(2, n); 
		          System.out.println("decimal "+decimal);
		          binary = binary/10;
		          System.out.println("binary "+binary);
		          n++;  
		       }  
		    }
		 System.out.println(decimal);
		
		}
	
}
