package org.selflearn.array;

import java.util.Arrays;

public class SecondMinValue {
	public static void main(String[] args) {
		
		int arr[]={10, 0, -1, 20, 25, 30};
		int smin,min,sum=45;
		
		smin=min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				smin=min;
				min=arr[i];
			}
			else if(smin>arr[i] && arr[i]!=min)
			{			
				smin=arr[i];
			}
		}
		
		System.out.println(min+" "+smin);
	}
}
		
