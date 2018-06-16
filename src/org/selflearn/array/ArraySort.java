package org.selflearn.array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int size,temp;
		int[] a={10,20,75,63,2,3,5};
		
		Arrays.sort(a);
		size=a.length;
		
		/*for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}*/
		System.out.print("Ascending Order:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + ",");
        }

	}

}
