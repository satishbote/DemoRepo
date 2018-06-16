package org.selflearn.array;

import java.util.Arrays;

public class MaxNumInArray {

	public static void main(String[] args) {
		
		int[] a={10,5,56,89,94,52,3};
		int max;
		max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		Arrays.sort(a);
		System.out.println(a[a.length-1]);

	}

}
