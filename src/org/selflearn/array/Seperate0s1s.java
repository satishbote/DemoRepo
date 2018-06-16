package org.selflearn.array;

public class Seperate0s1s {

	public static void main(String[] args) {

		int[] arr={1,0,1,1,1,0,0,0};
		int[] arr1=new int[arr.length];
		
			int count=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
					count++;
			}
			
			for(int i=0;i<count;i++)
			{
				arr1[i]=0;
			}
			
			for(int i=count; i<arr.length;i++)
			{
				arr1[i]=1;
			}
			
			for(int i=0;i<arr1.length;i++)
			{
				System.out.print(arr1[i]);
			}
	}

}
